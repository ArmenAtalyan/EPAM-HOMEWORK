package model;

public class University {

    private Faculty[] faculties;

    public University(Faculty... faculties) {
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }
}
