package exceptions;

public class NullFacultyException extends Exception {
    @Override
    public String toString() {
        return "You must have at least one faculty.";
    }
}
