package app.exceptions;

public class ProgrammerNotAvailableException extends RuntimeException{
    private int unavailableTime;

    public ProgrammerNotAvailableException(int unavailableTime) {
        this.unavailableTime = unavailableTime;
    }

    public int getUnavailableTime() {
        return unavailableTime;
    }
}