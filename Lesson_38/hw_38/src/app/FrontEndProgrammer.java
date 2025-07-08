package app;

public class FrontEndProgrammer extends Programmer {
    final String jobTitle = "Frontend - программист";
    public FrontEndProgrammer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }
}
