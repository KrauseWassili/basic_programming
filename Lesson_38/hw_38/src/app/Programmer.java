package app;

public class Programmer extends Employee {
    final String jobTitle = "Программист";

    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }
}
