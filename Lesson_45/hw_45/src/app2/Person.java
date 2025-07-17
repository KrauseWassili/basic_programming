package app2;

import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    private int age;
    private String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String toString (){
        return System.lineSeparator() + "Owner: " + fName + " " + lName + ", " + age + " years old, E-Mail: " + email;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(fName);
        result = 31 * result + Objects.hashCode(lName);
        return result;
    }
}

