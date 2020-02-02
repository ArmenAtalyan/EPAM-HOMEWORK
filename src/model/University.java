package model;

import exception.NullFacultyException;

public class University {

    private String name;
    private Faculty[] faculties;

    public University(String name, Faculty... faculties) throws NullFacultyException {

            if(faculties.length == 0)
                throw new NullFacultyException("You must have at least one faculty.");
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }
}
