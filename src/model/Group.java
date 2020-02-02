package model;

import exception.NullStudentsException;

public class Group {

    private Student[] students;
    private int id;

    public Group(int id, Student... students) throws NullStudentsException{
        validateStudents(students);
        this.students = students;
        this.id = id;
    }

    private void validateStudents(Student[] students) throws NullStudentsException{
        if(students == null)
            System.out.println("Array students cant be null");
        if(students.length == 0)
            System.out.println("You must have at least one student.");
        if(hasNullItem(students))
            System.out.println("One or many students in array are null, which is not allowed.");
    }

    private boolean hasNullItem(Object[] objects){
        for(Object o : objects){
            if(o == null)
                return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public Student[] getStudents() {
        return students;
    }
}

