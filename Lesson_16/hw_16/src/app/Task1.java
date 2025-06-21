/*
Wassili Krause HW_16_1 cochort_68M

Задача 1
Пользователь вводит целое число. Ваша задача определить может ли это число являться валидным номером месяца
(т.е. от 1 до 12) и записать это значение в переменную boolean isMonthValid.
Если isMonthValid - программа должна выводить сообщение "месяц корректный",
иначе выводить сообщение: "ошибка ввода месяца".
 */

package app;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        if (1<=monthNumber && monthNumber<=12) {
            System.out.println("Месяц корректный");

        }else{
            System.out.println("Ошибка ввода месяца");
        }

    }
}

