package comparators;

import model.Student;
import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().charAt(0) - s2.getFirstName().charAt(0);
    }
}
