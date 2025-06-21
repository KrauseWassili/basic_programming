/*
Wassili Krause HW_19_2 cochort_68M

Задача 2
Пользователь водит целое число. Ваша задача определить, является ли это число простым.
Напомню, простое число это то, которое без остатка делится только на 1 и на само себя,
иными словами, не делится ни на какое число больше. Например:

5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6
 */

package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число");
        int num1 = scanner.nextInt();
        int divider = 2;

        boolean isPrime = true; //определяем флаг простого числа как true, на случай если в while не найдется делителя

        if(num1==0) {
            isPrime = false;
        }

        while (divider < num1) {
            if (num1 % divider == 0) {
                isPrime = false;
                break; // выходим из цикла, т.к. дальше смысла нет перебирать значения.
            }
            divider++;
        }
        if (isPrime) {
            System.out.println("Число является простым.");
        } else {
            System.out.println("Число НЕ является простым.");
        }
    }
}

