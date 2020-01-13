package model;

public class Group {

    private Student[] students;

    public Group(Student... students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}

