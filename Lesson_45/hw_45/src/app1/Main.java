/*
1  Использование Stream
Дан список  BankAccount {Person owner, String IBAN, double balance).
Класс Person состоит из {String fName, String lName, int age, String email)
Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.
Используя stream необходимо получить List<Person> всех владельцев счетов, баланс которых больше 10000
Используя stream необходимо получить List<BankAccount> владельцы которых младше 21
Используя stream,  сформировать лист строк вида “Lennon J.;IBAN: DE199988643;lennon@gmail.com”
(т.е. ФИО; счет, email)  для всех клиентов, чей баланс более 100000
*/
package app1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccountList = new ArrayList<>(List.of(
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
                new BankAccount(new Person("Anna", "Moore", 19, "anna.moore@webmail.de"),
                        "DE55443322116677889900", 200330.0),
                new BankAccount(new Person("Robert", "Walker", 45, "robert.walker@net.org"),
                        "DE66778899001122334455", 52.4),
                new BankAccount(new Person("Olivia", "Hall", 33, "olivia.hall@domain.net"),
                        "DE31415926535897932384", 91.8)
        ));


        System.out.println("Счета, баланс которых составляет менее 100");
        List<BankAccount> accountList1 = bankAccountList.stream()
                .filter(b -> b.getBalance()<100)
                .toList();
        System.out.println(accountList1);

        System.out.println("\nВладельцы счетов, баланс которых больше 10000");
        List<Person> personList1 = bankAccountList.stream()
        .filter(b -> b.getBalance()>10000)
                .map(b -> b.getOwner())
                .toList();
        System.out.println(personList1);

        System.out.println("\nСчета, владельцы которых младше 21");
        List<BankAccount> accountList2 = bankAccountList.stream()
                .filter(b -> b.getOwner().getAge()<21)
                .toList();
        System.out.println(accountList2);



        System.out.println("\nСписок строк вида “Lennon J.;IBAN: DE199988643;lennon@gmail.com для всех клиентов, чей баланс более 100000");
        List<String> stringList1 = bankAccountList.stream()
                .filter(b -> b.getBalance() > 100000)
                .map(b -> System.lineSeparator() + b.getOwner().getlName() + " " + b.getOwner().getfName().charAt(0) + ".;IBAN: " + b.getIBAN() + ";" + b.getOwner().getEmail())
                .toList();
        System.out.println(stringList1);
    }
}
