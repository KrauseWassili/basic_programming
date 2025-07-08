package app;

public class QAEngineer extends Employee {
    final String jobTitle = "QA - инженер";
    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }
}
