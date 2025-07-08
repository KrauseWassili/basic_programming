package app;

import java.util.ArrayList;
import java.util.List;

public class Manager<T> extends Employee{

    private List<T> employeeList = new ArrayList<>();
    final String jobTitle = "Менеджер";


    public Manager(String name, int salary) {
        super(name, salary);
    }

    public List<T> getEmployeeList() {
        return employeeList;
    }
    @Override
    public String getJobTitle() {
        return jobTitle;
    }

}
