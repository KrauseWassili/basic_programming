package app2.model;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private static List<Person> personList = new ArrayList<>();

    public PersonList(List<Person> personList) {
        this.personList = personList;
    }

    public static void add(Person person){
        personList.add(person);
    }

    public static List<Person> getPersonList() {
        return personList;
    }
}
