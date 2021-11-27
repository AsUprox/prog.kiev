package study;

import java.util.*;

public class InputStudent {
    // на выходе массив из введённых через пробел данных
    // контроль значений в классе Student
    public static String[] input() {
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

}
