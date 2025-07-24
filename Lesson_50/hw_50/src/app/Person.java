package app;

public class Person {
    private String name;
    private Integer age;
    private String email;

    public Person(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + name + " " + age + " " + email;
    }
}
