package app;

public class Employee {
    final String jobTitle = "Работник";
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return  System.lineSeparator() + "Должность: " + getJobTitle() + "; Имя: " + getName() + "; З.П.: " + getSalary() + " у.е.";
    };
}
