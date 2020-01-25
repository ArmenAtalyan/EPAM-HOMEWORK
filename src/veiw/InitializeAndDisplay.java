package veiw;

import model.Student;
import service.CustomDynamicArray;
import service.CustomLinkedList;

import java.util.Iterator;

public class InitializeAndDisplay {
    CustomDynamicArray dynamicArray = new CustomDynamicArray();
    CustomLinkedList linkedList = new CustomLinkedList();
    Student[] array;

    public InitializeAndDisplay(Student[] array) {
        this.array = array;
    }

    public void initialize() {
        for (int i = 0; i < array.length; i++) {
            dynamicArray.add(array[i]);
            linkedList.push(array[i]);
        }
    }

    public void print() {
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println();
        Iterator<Student> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
