package exception;

public class NullGroupException extends Exception {
    public NullGroupException(){}

    public NullGroupException(String message) {
        super(message);
    }

    public NullGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullGroupException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "You must have at least one group.";
    }
}
