package app1;

import java.util.List;

public class Programmer {
    private String name;
    private List<Task> tasks;

    public Programmer(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return name + " " + tasks;
    }
}
