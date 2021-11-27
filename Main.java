package study;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // начальное заполнение
        Group am2 = new Group("am2");
        Student John = new Student("John", "Snow", Gender.MALE, "am2", 123);
        Student Elton = new Student("Elton", "John", Gender.MALE, "am2", 124);
        Student Mary = new Student("Mary", "Kristmaas", Gender.FEMALE, "am2", 125);
        Student Alex = new Student("Alex", "Campbell", Gender.MALE, "am2", 126);
        Student Max = new Student("Max", "Kurtz", Gender.MALE, "am2", 127);
        Student Linzy = new Student("Linzy", "Overwhelmed", Gender.FEMALE, "am2", 128);
        Student Sandy = new Student("Sandy", "Campbell", Gender.FEMALE, "am2", 129);
        Student Georg = new Student("Georg", "Fifth", Gender.MALE, "am2", 130);
        Student Helen = new Student("Helen", "Mele", Gender.FEMALE, "am2", 131);
        Student Ann = new Student("Ann", "Candy", Gender.FEMALE, "am2", 132);
        Student Sarah = new Student("Sarah", "Connor", Gender.FEMALE, "am2", 133);

        Student Randy = new Student();
        Randy.readStudent();
        System.out.println(Randy);

        // переполняем массив
        Student[] arr = new Student[] {John, Elton, Mary, Alex, Max, Linzy, Sandy, Georg, Helen, Ann, Sarah};
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
    }
}
