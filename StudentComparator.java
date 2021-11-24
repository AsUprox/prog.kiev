package study;

import java.util.Comparator;

public class StudentComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String name1 = null;
        String name2 = null;
        if (o1 != null) name1 = ((Person) o1).getLastName();
        if (o2 != null) name2 = ((Person) o2).getLastName();

        if (name1 == null || name2 == null) {
            return 0;
        }
        else if (name1.equals(name2)) {
            return 0;
        }
        else {
            return name1.compareTo(name2);
        }
    }
}
