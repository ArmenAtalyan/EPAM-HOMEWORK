package service;

import model.Student;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class ListNode{
        private Student student;
        private ListNode next;
        private ListNode previous;

        public ListNode(Student student){
            this.student = student;
        }

        public Student getStudent() {
            return student;
        }

        public ListNode getNext() {
            return next;
        }
    }

    public void push(Student student){
        ListNode newNode = new ListNode(student);
        if(isEmpty())
            tail = newNode;
        else
            head.previous = newNode;

        newNode.next = head;
        head = newNode;
        size++;
    }

    public Student pop(){
        if(isEmpty())
            throw new NoSuchElementException();
        ListNode temp = head;
        if(head == tail)
            tail = null;
        else
            head.next.previous = null;

        head = head.next;
        temp.next = null;
        size--;
        return temp.student;
    }

    public void addLast(Student student){
        ListNode newNode = new ListNode(student);
        if(isEmpty())
            head = newNode;
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        size++;
    }

    public Student removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        ListNode temp = tail;
        if(head == tail)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
        temp.previous = null;
        size--;
        return temp.student;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Iterator<Student> iterator() {
        Iterator<Student> iterator = new Iterator<Student>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size &&  head != null;
            }

            @Override
            public Student next() {
                return head.getStudent();
            }
        };
        return iterator;
    }
}
