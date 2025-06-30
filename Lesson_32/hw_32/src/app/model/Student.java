package app.model;

public class Student {
    private static int studentNumber = 0;
    private int id;
    private String name;
    private String group;

    public Student(String name, String group) {
        studentNumber++;
        this.id = studentNumber;
        this.name = name;
        this.group = group;
    }

    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public static int getStudentsNumber(){
        return studentNumber;
    }
}
