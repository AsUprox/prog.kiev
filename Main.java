package study;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // начальное заполнение
        Group am2 = new Group("am2");
        Student john = new Student("John", "Snow", Gender.MALE, "am2", 123);
        Student elton = new Student("Elton", "John", Gender.MALE, "am2", 124);
        Student mary = new Student("Mary", "Kristmaas", Gender.FEMALE, "am2", 125);
        Student alex = new Student("Alex", "Campbell", Gender.MALE, "am2", 126);
        Student max = new Student("Max", "Kurtz", Gender.MALE, "am2", 127);
        Student linzy = new Student("Linzy", "Overwhelmed", Gender.FEMALE, "am2", 128);
        Student sandy = new Student("Sandy", "Campbell", Gender.FEMALE, "am2", 129);
        Student georg = new Student("Georg", "Fifth", Gender.MALE, "am2", 130);
        Student helen = new Student("Helen", "Mele", Gender.FEMALE, "am2", 131);
        Student ann = new Student("Ann", "Candy", Gender.FEMALE, "am2", 132);
        Student sarah = new Student("Sarah", "Connor", Gender.FEMALE, "am2", 133);

//        Student randy = new Student();
//        randy = randy.fromKeyboard();
//        System.out.println(randy);
//
//        Student tomas = new Student();
//        tomas = tomas.fromCSVString("Tomas   ,  Mann  , male   , am2, 222");
//        System.out.println(tomas);


        // переполняем массив
        Student[] arr = new Student[] {john, elton, mary, alex, max, linzy, sandy, georg, helen, ann, sarah};
        for (int i = 0; i < arr.length; i++) {
            try {
                am2.addStudent(arr[i]);
            }
            catch (GroupOverflowException e) {
                System.out.println("Group is overflowed");
            }
        }
        System.out.println("New student list");
        System.out.println(am2);

        GroupFileStorage.saveGroupToCSV(am2);

        // новая группа am3
        Group am3 = new Group("am3");
        String dir = new String("/home/scorp/1");
        String studFile = new String("am2.csv");
        File ff = new File(dir, studFile);
        if (ff.isFile()) {
            am3 = GroupFileStorage.loadGroupFromCSV(ff);
            System.out.println(am3);
        }
        else {
            System.out.println("File " + dir + '/' + studFile + " not found");
        }

        File myDir = new File("/home/scorp/1");
        File fff = GroupFileStorage.findFileByGroupName( "am3", myDir);

    /*
        // пробуем удалить
        long ids = 128;
        try {
            am2.deleteStudent(ids);
        }
        catch (GroupVoidException e) {
            System.out.println("There is no such student with id " + ids);
        }
        System.out.println("Student list without id " + ids);
        System.out.println(am2);

        // пробуем добавить
        Student nm = Sarah;
        try {
            am2.addStudent(nm);
        }
        catch (GroupOverflowException e) {
            System.out.println("No more place, again!");
        }
        System.out.println("Student list with " + nm.getName() + " " + nm.getLastName());
        System.out.println(am2);

        // пробуем найти
        String aName = "Fifth";
        try {
            System.out.println("Student " + aName);
            System.out.println(am2.searchByLastName(aName));
        }
        catch (GroupVoidException e) {
            System.out.println(aName + " not found");
        }

        */
    }
}
