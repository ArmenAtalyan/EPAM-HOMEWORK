import comparators.AgeComparator;
import comparators.FirstNameComparator;
import model.Student;
import service.CustomDynamicArray;
import service.CustomLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        List<Student> list2 = new LinkedList<>();

        Student s1 = new Student("Vardan", "Aramyan", 19);
        Student s2 = new Student("Ani", "Khachatryan", 31);
        Student s3 = new Student("Zaven", "Sahakyan", 58);
        Student s4 = new Student("Sona", "Hakobyan", 39);
        Student s5 = new Student("Babken", "Tunyan", 42);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        list2.add(s1);
        list2.add(s2);
        list2.add(s3);
        list2.add(s4);
        list2.add(s5);


//          Comparator ageComparator = new AgeComparator();
//          Comparator firstNameComparator = new FirstNameComparator();
//        Collections.sort(list, firstNameComp);
//        System.out.println(list);
//        Collections.sort(list, Collections.reverseOrder(ageComp));
//        System.out.println(list);
//        Collections.sort(list2);
//        System.out.println(list2);

        CustomDynamicArray dynamicArray = new CustomDynamicArray();
        dynamicArray.add(s1);
        dynamicArray.add(s2);
        dynamicArray.add(s3);
        dynamicArray.add(s4);
        dynamicArray.add(s5);
//        dynamicArray.remove(s3);

        for(int i = 0; i < dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));
        }


    }
}
