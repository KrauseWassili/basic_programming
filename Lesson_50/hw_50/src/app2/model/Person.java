package app2.model;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private String email;

    public Person(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(age);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + name + " " + age + " " + email;
    }
}
