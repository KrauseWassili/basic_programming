package app3;/*
3. Предположим, у вас есть список объектов Account { String iban, Person owner}.
У каждого клиента может быть несколько счетов. Ваша задача написать метод,
который сформирует Map<Person, List<String>>, где ключом будет владелец счета,
а значением - список номеров (iban) счетов.

Подсказка: т.к. Person это ключ, система должна уметь определить равен ли один Person другому. Т.е. equals и hashCode

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>(List.of(
                new Account("DE123456788901234567890", new Person("Simon", "Simonov")),
                new Account("DE345678901234567890123", new Person("Evgenia", "Silivanova")),
                new Account("DE234567890123456789012", new Person("Alexej", "Simonov")),
                new Account("DE321543765987321432543", new Person("Pjotr", "Petrov")),
                new Account("DE321456788901234567098", new Person("Simon", "Simonov")),
                new Account("DE987654321987654321543", new Person("Alexej", "Simonov"))
        ));
        Map<Person, List<String>> accountMap = new HashMap<>();
        writeAccountsToMap(accountList,accountMap);
        System.out.println(accountMap);

    }

    public static void writeAccountsToMap(List<Account> accountList, Map<Person, List<String>> accountMap) {

        for (Account account : accountList) {
            List<String> ibanList = accountMap.get(account.getPerson());
            if (ibanList == null) {
                ibanList = new ArrayList<>();
                accountMap.put(account.getPerson(), ibanList);
            }
            ibanList.add(account.getIban());
        }
    }
}
