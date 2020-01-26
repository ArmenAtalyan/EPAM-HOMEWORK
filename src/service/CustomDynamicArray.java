package service;

import model.Student;

public class CustomDynamicArray {

    private int capacity;
    private int indexSize;
    private Student[] students;

    public CustomDynamicArray() {
        this.capacity = 16;
        this.indexSize = 0;
        students = new Student[capacity];
    }

    public boolean add(Student student) {
        if (indexSize == capacity) {
            int newCapacity = capacity * 2;
            Student[] newStudents = new Student[newCapacity];
            System.arraycopy(students, 0, newStudents, 0, students.length);
        }
        students[indexSize] = student;
        indexSize++;
        return true;
    }

    public boolean remove(Student student) {
        for (int i = 0; i < indexSize; i++) {
            if (student.equals(students[i])) {
                int temp = i;
                students[i] = null;
                while (temp < indexSize-1) {
                    students[temp] = students[temp + 1];
                    students[temp + 1] = null;
                    temp++;
                }
                indexSize--;
                capacity--;
                break;
            } else {
                throw new NullPointerException("There is no such object here.");
            }
        }
        return true;
    }

    public int size() {
        return indexSize;
    }

    public Student get(int index) {
        if (index <= indexSize)
            return students[index];
        else
            throw new ArrayIndexOutOfBoundsException("There is no such index here.");
    }
}
