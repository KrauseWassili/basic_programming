/*
Wassili Krause HW_23_2 cochort_68M

Задача 3 (чуть сложнее)
Создайте классы MyData и Person по примеру того, как это было на занятии.
Создайте класс BankAccount (банковский счет) со следующими полями

String iban - номер счета
double balance - баланс счета
Person owner - владелец счета
MyDate open - дата открытия Вам необходимо создать конструктор и затем создать в программе несколько объектов банковских счетов
Необходимо написать метод, который формирует строку с информацией о счете, например, такого вида:
 */

package Task2;

public class Main {
    public static void main(String[] args) {
        MyDate birthday1 = new MyDate(19, 10, 1987);
        MyDate openYear1 = new MyDate(1, 2, 2025);
        Person person1 = new Person("Николай", "Петров", birthday1);

        BankAccount bankAcc1 = new BankAccount("DE123412341234", 10_345.10, person1, openYear1);

        MyDate birthday2 = new MyDate(30, 03, 1977);
        MyDate openYear2 = new MyDate(17, 12, 2023);
        Person person2 = new Person("Сергей", "Иванов", birthday1);

        BankAccount bankAcc2 = new BankAccount("DE127654341234", 33_744.33, person2, openYear2);

        printBankAccount(bankAcc1);
        printBankAccount(bankAcc2);
    }

    public static void printBankAccount(BankAccount bankAcc){
        System.out.println(bankAcc.iban + " " + bankAcc.owner.firstName.charAt(0) + "." + bankAcc.owner.lastName +
                " (" + bankAcc.owner.birthday.day + "/" + bankAcc.owner.birthday.day + "/" + bankAcc.owner.birthday.year +
                ") Счет открыт: " + bankAcc.open.day + "/" + bankAcc.open.month + "/" + bankAcc.open.year);
    }

}
