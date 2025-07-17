/*
2. По желанию (обобщенный метод)
Напишите обобщенный метод (пока без stream), который принимает список каких то объектов,
например Person или строк, и формирует Map< … , Integer > - где ключем является объект, значением,
сколько раз этот объект встречается в изначальном списке.

Например: есть список Person, метод должен сформировать Map<Person, Integer>, где ключ person,
значение сколько раз встретился данный человек в списке. Или есть список BankAccount,
метод должен сформировать Map<BankAccount, Integer>, где ключ account,
значение сколько раз встретился данный счет в списке.
*/
package app2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("John", "Brown", 35, "john.brown@web.de"),
                new Person("Emily", "Clark", 28, "emily.clark@mail.com"),
                new Person("Michael", "Miller", 42, "michael.miller@domain.com"),
                new Person("Sarah", "Wilson", 31, "sarah.wilson@example.org"),
                new Person("John", "Brown", 35, "john.brown@web.de"),
                new Person("David", "Taylor", 50, "david.taylor@provider.net"),
                new Person("Laura", "Anderson", 22, "laura.anderson@abc.com"),
                new Person("James", "Thomas", 38, "james.thomas@site.de"),
                new Person("Anna", "Moore", 29, "anna.moore@webmail.de"),
                new Person("Laura", "Anderson", 22, "laura.anderson@abc.com"),
                new Person("Robert", "Walker", 45, "robert.walker@net.org"),
                new Person("Olivia", "Hall", 33, "olivia.hall@domain.net")
        ));

        List<BankAccount> bankAccountList = new ArrayList<>(List.of(
                new BankAccount(new Person("Sarah", "Wilson", 31, "sarah.wilson@example.org"),
                        "DE56781234987612349876", 7850.5),
                new BankAccount(new Person("John", "Brown", 35, "john.brown@web.de"),
                        "DE56473859872364859374", 22342.4),
                new BankAccount(new Person("Emily", "Clark", 18, "emily.clark@mail.com"),
                        "DE10293847561029384756", 154004.0),
                new BankAccount(new Person("Michael", "Miller", 42, "michael.miller@domain.com"),
                        "DE99887766554433221100", 3000.75),
                new BankAccount(new Person("Sarah", "Wilson", 31, "sarah.wilson@example.org"),
                        "DE56781234987612349876", 7850.5),
                new BankAccount(new Person("David", "Taylor", 50, "david.taylor@provider.net"),
                        "DE44556677889900112233", 125000.99),
                new BankAccount(new Person("Laura", "Anderson", 20, "laura.anderson@abc.com"),
                        "DE12344321123443211234", 542.0),
                new BankAccount(new Person("James", "Thomas", 38, "james.thomas@site.de"),
                        "DE01928374650192837465", 8000.0),
                new BankAccount(new Person("Robert", "Walker", 45, "robert.walker@net.org"),
                        "DE66778899001122334455", 52.4),
                new BankAccount(new Person("Anna", "Moore", 19, "anna.moore@webmail.de"),
                        "DE55443322116677889900", 200330.0),
                new BankAccount(new Person("Robert", "Walker", 45, "robert.walker@net.org"),
                        "DE66778899001122334455", 52.4),
                new BankAccount(new Person("Olivia", "Hall", 33, "olivia.hall@domain.net"),
                        "DE31415926535897932384", 91.8)
        ));


        System.out.println(personList);
        System.out.println(listToMap(personList));      //equals: fName + lName

        System.out.println(bankAccountList);
        System.out.println(listToMap(bankAccountList)); //Здесь equals настроен также по fName + lName

    }

    public static <T> Map<T, Integer> listToMap(List<T> tList) {
        Map<T, Integer> res = new HashMap<T, Integer>();
        for (T t : tList) {
            res.put(t, res.getOrDefault(t, 0) + 1);
        }
        return res;
    }
}
