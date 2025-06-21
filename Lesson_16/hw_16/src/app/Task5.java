/*
Wassili Krause HW_16_5 cochort_68M

Задача 5
Напишите программу, которая запрашивает у пользователя три числа. Программа должна определить наибольшее из трех чисел.

Например:
Ввод: -3, 10, 7 -> Результат: 10
Ввод: 9, 3, 9 -> Результат: 9
 */

package app;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int number3 = scanner.nextInt();

        System.out.print("Ввод: " + number1 + ", " + number2 + ", " + number3 + "-> Результат: ");

        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1);
        }

        if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2);
        }

        if (number3 >= number1 && number3 >= number2) {
            System.out.println(number3);
        }


    }
}