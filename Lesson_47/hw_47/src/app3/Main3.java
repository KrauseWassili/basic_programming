/*
3. Дан список Account (String iban, Person owner, double balance).
У одного владельца может быть несколько счетов. Ваша задача получить Map<Person,Long> где ключ,
владелец счета, значение сумма его вкладов.
*/

package app3;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {

        List<Account> accountList = List.of(
                new Account("DE89 3704 0044 0532 0130 00", new Person("John", "Brown", 32), 23534.33),
                new Account("DE44 5001 0517 5407 3249 31", new Person("Emily", "Clark", 28), 15400.50),
                new Account("DE68 2105 0170 0012 3456 78", new Person("Michael", "Miller", 45), 4820.75),
                new Account("DE12 3456 7890 1234 5678 90", new Person("Olivia", "Hall", 33), 78900.00),
                new Account("DE98 7654 3210 0000 1234 56", new Person("David", "Taylor", 38), 120.00),
                new Account("DE33 5001 0517 0800 9876 54", new Person("John", "Brown", 32),  9999.99),
                new Account("DE22 3704 0044 0001 2345 67", new Person("James", "Thomas", 41), 30200.00),
                new Account("DE55 6001 0070 1234 5678 90", new Person("Anna", "Moore", 27), 4700.10),
                new Account("DE77 1002 0500 1234 5678 00", new Person("Sarah", "Wilson", 30), 100.00),
                new Account("DE88 2004 0010 1234 5678 91", new Person("Olivia", "Hall", 33), 6800.80)
        );

        Map<Person,Long> accountMap = accountList.stream()
                .collect(Collectors.toMap(Account::getOwner, p->p.getBalance().longValue(), Long::sum));
        accountMap.forEach((k,v)-> System.out.println(k+" "+v));

    }

}
