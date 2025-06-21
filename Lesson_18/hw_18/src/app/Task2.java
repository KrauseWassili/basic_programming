/*
Wassili Krause HW_18_2 cochort_68M
Задача 2
Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ввша программа должна считать, сколько раз заданный символ встречается во введенной строке

Например:

hello java
a

результат: 2

 */

package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String inputString1 = scanner.nextLine();
        System.out.println("Введите символ:");
        String inputString2 = scanner.nextLine();
        char inputChar = inputString2.charAt(0);


        int count = 0;
        int index = 0;
        while (index < inputString1.length()) {
            if (inputString1.charAt(index) == inputChar) {
                count++;
            }
            index++;
        }

        System.out.println("Введенный символ встречается в строке " + count + " раз.");
    }
}
