/*
Wassili Krause HW_20_2 cochort_68M

Задача 2
Дан массив строк. Необходимо вывести его на экран.
Далее программа должна запросить два целых числа - номера элементов,
и поменять местами соответствуюзие элементы. После чего опять вывести массив на экран.
 */

package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringArr[] = {"str0", "str1", "str2", "str3", "str4"};

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(i + ". " + stringArr[i]);
        }

        System.out.println("Введите целое число 0...4");
        int num1 = scanner.nextInt();

        System.out.println("Введите целое число 0...4, отличное от первого");
        int num2 = scanner.nextInt();

        String buffer = stringArr[num1];
        stringArr[num1] = stringArr[num2];
        stringArr[num2] = buffer;

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(i + ". " + stringArr[i]);
        }
    }
}

