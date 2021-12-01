package study;

import java.util.*;

public class InputStudent {
    // на выходе массив из введённых через пробел данных
    // контроль значений в public static Student fill(String[])
    public static String[] fromKB() {
        Scanner inp = new Scanner(System.in);
        String[] inputString = new String[5];

        System.out.println("Please input new student\n" +
                "name, last name, gender, group name, id");
        for (int i = 0; i < 5; i++) {
            if (inp.hasNext()) {
                try {
                    inputString[i] = inp.next();
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Check entered data!");
                }
            }
        }

        return inputString;
    }

    public static String[] fromCSV(String str) {
        str = str.trim();
        str = str.substring(0, str.length() - 1);
        return str.split(";|,");
    }

    public static Student fill(String[] str)
            throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
    // создание объекта Student и заполнение его состояния из массива строк,
    // где каждая строка - отдельное поле
        Student stud = new Student();
        for (int i = 0; i < 5; i++) {
            str[i] = str[i].trim();
        }
        try {
            stud.setName(str[0]);
            stud.setLastName(str[1]);
            stud.setSex(Gender.valueOf(str[2].toUpperCase()));
            stud.setGropeName(str[3]);
            stud.setId(Long.parseLong(str[4]));
        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Check entered data!");
        }
        return stud;
    }
}
