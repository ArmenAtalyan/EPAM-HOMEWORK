package model;

public class Group {

    private Student[] students;

    public Group(Student... students) {
        for (Student student : students) {
            student.setGroup(this);
        }
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}

