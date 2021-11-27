package study;

import java.util.*;

public class Group {
    private final String groupName;
    private Student[] group = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent (Student st) throws GroupOverflowException {
        int i = 0;
        // пропускаем все заполненные элементы массива
        while (group[i] != null) {
            if (++i == 10) throw new GroupOverflowException();
        }
        group[i] = st;
    }

    public void deleteStudent (long id) throws GroupVoidException {
        Student[] newArray = new Student[10];
        int i;
        int j = 0;

        for (i = 0; i < 10; i++) {
            if ( group[i] != null && group[i].getId() != id ) {
                newArray[j++] = group[i];
            }
        }
        // не нашли
        if (i == j) {
            throw new GroupVoidException();
        }
        else {
            group = newArray;
        }
    }

    public Student searchByLastName (String lastName) throws GroupVoidException {
        for (int i = 0; i < 10; i++) {
            if (group[i] != null && group[i].getLastName().equals(lastName)) {
                return group[i];
            }
        }
        throw new GroupVoidException();
    }

    public void sortStudentsByLastName() {
        Arrays.sort(group, new StudentComparator());
    }

    @Override
    public String toString() {
        this.sortStudentsByLastName();
        return "Group{ " +
                "groupName='" + groupName + ", group=\n" + Arrays.toString(group) + '}';
    }
}
