package service;

import model.Student;

public class CustomDynamicArray {

    private int capacity;
    private int orderIndex;
    private Student [] students;

    public CustomDynamicArray(){}

    public CustomDynamicArray(Student[] students) {
        this.capacity = 10;
        this.orderIndex = 0;
        this.students = students;
    }

    public boolean add(Student student){
        if(orderIndex == capacity){
            capacity *= 2;
            students = new Student[capacity];
        }
        students[orderIndex] = student;
        orderIndex++;
        return true;
    }

    public boolean remove(Student student){
        if(students[orderIndex]==student){
            int temp = orderIndex;
            students[orderIndex] = null;
            while (temp < capacity) {
                students[temp] = students[temp + 1];
                students[temp + 1] = null;
                capacity--;
            }
        }else{
            throw new NullPointerException("There is no such object here.");
        }
        return true;
    }

    public int size(){
        return orderIndex;
    }

    public Student get(int index) {
        if(index <= orderIndex)
            return students[index];
        else
            throw new ArrayIndexOutOfBoundsException("There is no such index here.");
    }
}
