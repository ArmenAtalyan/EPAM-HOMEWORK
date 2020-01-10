public class InvalidMarkExeption extends Exception {

    public InvalidMarkExeption(){}

    public InvalidMarkExeption(String message) {
        super(message);
    }

    public InvalidMarkExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMarkExeption(Throwable cause) {
        super(cause);
    }
}
