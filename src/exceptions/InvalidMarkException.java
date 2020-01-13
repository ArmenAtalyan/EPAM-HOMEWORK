package exceptions;

public class InvalidMarkException extends Exception {
    @Override
    public String toString() {
        return "You must have at least one mark.";
    }
}
