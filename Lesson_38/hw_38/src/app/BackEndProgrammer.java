package app;

public class BackEndProgrammer extends Programmer {
    final String jobTitle = "Backend - программист";
    public BackEndProgrammer(String name, int salary) {
        super(name, salary);
    }
    @Override
    public String getJobTitle() {
        return jobTitle;
    }
}
