package exceptions;

public class NullGroupException extends Exception {
    @Override
    public String toString() {
        return "You must have at least one group.";
    }
}
