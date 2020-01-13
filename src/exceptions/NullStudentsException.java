package exceptions;

public class NullStudentsException extends Exception {

    @Override
    public String toString() {
        return "You must have at least one student.";
    }
}
