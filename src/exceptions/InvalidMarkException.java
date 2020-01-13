package exceptions;

public class InvalidMarkException extends ArithmeticException {
    @Override
    public String toString() {
        return "You must have at least one mark.";
    }
}
