package exceptions;

public class NullSubjectException extends Exception {

    @Override
    public String toString() {
        return "You must have at least one subject.";
    }
}
