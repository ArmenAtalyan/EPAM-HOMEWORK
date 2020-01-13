package model;

import exceptions.InvalidMarkException;

public class Student {

    private int id;
    private String name;
    private Mark[] marks;

    public Student(StudentBuilder builder) {
        id = builder.id;
        name = builder.name;
        marks = builder.marks;
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private Mark[] marks;

        public StudentBuilder id(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder marks(Mark... marks) {
            try {
                if(marks.length == 0){
                    throw new InvalidMarkException();
                }
            }catch (InvalidMarkException e){}
            this.marks = marks;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Mark[] getMarks() {
        return marks;
    }

}