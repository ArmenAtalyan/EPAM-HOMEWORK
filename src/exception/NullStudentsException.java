package exception;

public class NullStudentsException extends Exception {
    public NullStudentsException(){}

    public NullStudentsException(String message) {
        super(message);
    }

    public NullStudentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullStudentsException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "You must have at least one student.";
    }
}
