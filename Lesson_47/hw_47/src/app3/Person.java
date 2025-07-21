package app3;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + firstName + " " + lastName + " " + age + " years old";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        return result;
    }
}
