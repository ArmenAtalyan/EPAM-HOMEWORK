package service;

import model.Student;

public class CustomDynamicArray {

    private int capacity;
    private int orderIndex;
    private Student[] students;

    public CustomDynamicArray() {
        this.capacity = 16;
        this.orderIndex = 0;
        students = new Student[capacity];
    }

    public boolean add(Student student) {
        if (orderIndex == capacity) {
            int newCapacity = capacity * 2;
            Student[] newStudents = new Student[newCapacity];
            System.arraycopy(students, 0, newStudents, 0, students.length);
        }
        students[orderIndex] = student;
        orderIndex++;
        return true;
    }

    public boolean remove(Student student) {
        for (int i = 0; i < orderIndex; i++) {
            if (students[i] == student) {
                int temp = i;
                students[i] = null;
                while (temp < orderIndex) {
                    students[temp] = students[temp + 1];
                    students[temp + 1] = null;
                    temp++;
                }
                orderIndex--;
                capacity--;
            } else {
                throw new NullPointerException("There is no such object here.");
            }
        }
        return true;
    }

    public int size() {
        return orderIndex;
    }

    public Student get(int index) {
        if (index <= orderIndex)
            return students[index];
        else
            throw new ArrayIndexOutOfBoundsException("There is no such index here.");
    }
}
