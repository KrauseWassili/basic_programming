package app;

import java.util.Arrays;
import java.util.List;

public class Programmer {
    private String name;
    private String city;
    private List<Task> tasks;

    public Programmer(String name, String city, List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    public Programmer(String name, String city, Task ... tasks) {
        this.name = name;
        this.city = city;
        this.tasks = Arrays.asList(tasks);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return name + " from " + city;
    }
}
