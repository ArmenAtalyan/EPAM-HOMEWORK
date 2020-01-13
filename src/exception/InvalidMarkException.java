package exception;

public class InvalidMarkException extends Exception {

    public InvalidMarkException(){}
    public InvalidMarkException(String message) {
        super(message);
    }

    public InvalidMarkException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMarkException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "Mark must be more than 0 and less than 10.";
    }
}
