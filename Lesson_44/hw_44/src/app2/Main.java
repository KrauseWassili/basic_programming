/*
2

В программе задан список Person{ String fName, String lName, String email, String
phone, Address address}. Address{String postcode, String city, String street, String
house}
Реализовать следующие функции:
-получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов
-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.
*/
package app2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Name1", "LastName1", "E-Mail1", "PhoneNumber1");
        Person p2 = new Person("Name2", "LastName2", "E-Mail2", "PhoneNumber2");
        Person p3 = new Person("Name3", "LastName3", "E-Mail3", "PhoneNumber3");
        Person p4 = new Person("Name4", "LastName4", "E-Mail4", "PhoneNumber4");
        Person p5 = new Person("Name5", "LastName5", "E-Mail5", "PhoneNumber5");
        p1.addAdress("Postcode1", "City1", "Street1", "House1");
        p2.addAdress("Postcode2", "City2", "Street2", "House2");
        p3.addAdress("Postcode3", "City3", "Street3", "House3");
        p4.addAdress("Postcode4", "City4", "Street4", "House4");
        p5.addAdress("Postcode5", "City5", "Street5", "House5");

        List<Person> personList = new ArrayList<>(List.of(p1, p2, p3, p4, p5));
        System.out.println("Список персон с адресами:");
        System.out.println(personList);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите поле для вывода:\n 1. ФИО\n 2. E-Mail\n 3. телефон\n 4. адрес\n 0. завершить");
            int mode = scanner.nextInt();
            if (mode >= 1 && mode <= 4) {
                System.out.println(getFields(personList, mode));

            } else if (mode < 0 || mode > 4) {
                System.out.println(mode + "- неверный выбор! Попробуйте еще раз.");
            } else break;
        }

    }

    public static List<String> personField(List<Person> personList, GetField field) {
        List<String> res = new ArrayList<>();
        for (Person person : personList) {
            res.add(field.str(person));
        }

        return res;
    }

    public static List<String> getFields(List<Person> personList, int criterion) {
        switch (criterion) {
            case 1:
                return personField(personList, (Person person) -> {
                    return person.getfName() + " " + person.getlName();
                });
            case 2:
                return personField(personList, (Person person) -> {
                    return person.getEmail();
                });
            case 3:
                return personField(personList, (Person person) -> {
                    return person.getPhone();
                });
            case 4:
                return personField(personList, (Person person) -> {
                    return person.getAdress().toString();
                });
            default:
        }
        return null;
    }
}
