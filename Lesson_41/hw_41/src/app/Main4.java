/*
4. [по желанию] Дано два списка с Person необходимо получить Set с персонами,
которые присутствуют и в том и в другом списке
*/
package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        List<Person> personList1 = new ArrayList<>(List.of(
                new Person("Jack", "Jackson"),
                new Person("Niel", "Nielson"),
                new Person("John", "Johnson"),
                new Person("Len", "Lenson"),
                new Person("Frank", "Franklin")
        ));
        List<Person> personList2 = new ArrayList<>(List.of(
                new Person("Ben", "Benson"),
                new Person("Arthur", "Arthur-son"),
                new Person("William", "Willson"),
                new Person("Len", "Lenson"),
                new Person("Frank", "Franklin")
        ));
        System.out.println("Список 1:\n" + personList1);
        System.out.println("Список 2:\n" + personList2);

        System.out.println("\nСледующие персоны присутствуют в обоих списках:");
        System.out.println(searchForMach(personList1,personList2));
    }

    public static Set<Person> searchForMach(List<Person> personList1, List<Person> personList2){
        Set<Person> personSet = new HashSet<>(personList1);
        Set<Person> res = new HashSet<>();
        for(Person person: personList2){
            if(personSet.contains(person)){
                res.add(person);
            }
        }
        return res;
    }
}
