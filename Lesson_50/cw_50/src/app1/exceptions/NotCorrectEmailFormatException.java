package app1.exceptions;

public class NotCorrectEmailFormatException  extends RuntimeException{
    public NotCorrectEmailFormatException(String message) {
        super(message);
    }
}