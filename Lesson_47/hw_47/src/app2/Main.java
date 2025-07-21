/*
2. [поиск однофамильцев] Дан лист Person(firstName,lastName, age).
Ваша задача получить Map<String, List<Person>> где ключ lastName,
значение список Person с соответствующим lastName
 */

package app2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("John", "Brown", 32),
                new Person("Emily", "Clark", 28),
                new Person("Michael", "Miller", 45),
                new Person("Sarah", "Brown", 30),
                new Person("David", "Taylor", 38),
                new Person("Laura", "Anderson", 25),
                new Person("James", "Thomas", 41),
                new Person("Anna", "Brown", 27),
                new Person("Robert", "Walker", 36),
                new Person("Olivia", "Taylor", 33)
        );

        Map<String, List<Person>> personMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getLastName));
        personMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
