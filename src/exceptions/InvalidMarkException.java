package exceptions;

public class InvalidMarkException extends Exception {

    @Override
    public String toString() {
        return "Mark must be more than 0 and less than 10.";
    }
}
