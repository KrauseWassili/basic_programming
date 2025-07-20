package app;

import java.util.Objects;

public class Task {
    private Integer number;
    private String description;
    private String status;
    private Integer daysInProcessing;
    private static int count = 0;

    public Task(String description, String status, int daysInProcessing) {
        number = ++count;
        this.description = description;
        this.status = status;
        this.daysInProcessing = daysInProcessing;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Integer getDaysInProcessing() {
        return daysInProcessing;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Task number: " + number + " \"" + description + "\" " + " status: \"" + status + "\" " + daysInProcessing + " days";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Task task)) return false;

        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }
}
