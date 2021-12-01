package study;

import java.io.*;

public class GroupFileStorage {
    public static void saveGroupToCSV(Group gr) throws IOException {
        FileWriter gropeFile = new FileWriter("/home/scorp/1/"
                                    + gr.getGroupName()
                                    + ".csv");
        Student[] students = gr.getGroup();
        String content = new String();

        for (Student st : students) {
            content += st.toCSVString();
        }
        try {
            gropeFile.write(content);
            gropeFile.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Group loadGroupFromCSV(File file) throws IOException {
        Group newGroup = new Group("am3");
        Student stud = new Student();

        try (BufferedReader br = new BufferedReader( new FileReader(file))) {
            String str;
            while ((str = br.readLine()) != null) {
                stud = stud.fromCSVString(str);
                newGroup.addStudent(stud);
            }
        }
        catch (IOException | GroupOverflowException e) {
            System.out.println(e.getMessage());
        }
        return newGroup;
    }

    public static File findFileByGroupName(String groupName, File workFolder) {
        if (!workFolder.isDirectory()) {
            System.out.println("Directory " + workFolder + " not found");
            return null;
        }
        File groupFile = new File(workFolder, groupName + ".csv");

        if (!groupFile.isFile()) {
            System.out.println("Can't find " + workFolder + '/' + groupName + ".csv");
        }

        return groupFile;
    }
}
