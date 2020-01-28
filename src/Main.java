import comparators.AgeComparator;
import comparators.FirstNameComparator;
import model.Student;
import service.CustomDynamicArray;
import service.CustomLinkedList;
import veiw.InitializeAndDisplay;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Vardan", "Aramyan", 19);
        Student s2 = new Student("Ani", "Khachatryan", 31);
        Student s3 = new Student("Zaven", "Sahakyan", 58);
        Student s4 = new Student("Sona", "Hakobyan", 39);
        Student s5 = new Student("Babken", "Tunyan", 42);
        Student[] students = {s1, s2, s3, s4, s5};

        List<Student> list = new ArrayList<>(Arrays.asList(students));
        List<Student> list2 = new ArrayList<>(Arrays.asList(students));

        System.out.println("Unsorting students" + "\n" + list);

        Comparator ageComparator = new AgeComparator();
        Comparator firstNameComp = new FirstNameComparator();

        Collections.sort(list, firstNameComp);
        System.out.println("Sorting students by first name in ascending order " + "\n" + list);

        Collections.sort(list, Collections.reverseOrder(ageComparator));
        System.out.println("Sorting students by age in descending order " + "\n" + list);

        Collections.sort(list2);
        System.out.println("Sorting students by last name in ascending order " + "\n" + list2);
        System.out.println();

        InitializeAndDisplay initAndPrint = new InitializeAndDisplay(students);
        initAndPrint.initialize();
        initAndPrint.print();

        List<String> list1 = new ArrayList<>();

    }
}
