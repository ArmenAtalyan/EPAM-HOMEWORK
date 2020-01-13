package model;

import exceptions.NullStudentsException;

public class Group {

    private Student[] students;
    private int id;

    public Group(int id, Student... students) {
        try {
            if(students.length == 0){
                throw new NullStudentsException();
            }
        }catch (NullStudentsException e){}
        this.students = students;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Student[] getStudents() {
        return students;
    }
}

