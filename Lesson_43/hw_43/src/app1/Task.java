package app1;

public class Task {
    private int number;
    private String description;

    public Task(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return number + ". " + description;
    }
}
