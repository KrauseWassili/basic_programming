package app1.exceptions;

public class InvalidEmailLengthException extends RuntimeException{

    public InvalidEmailLengthException(String message) {
        super(message);
    }
}
