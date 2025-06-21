/*
Wassili Krause HW_20_3 cochort_68M

Задача 3
Дан массив строк. Пользовтель вводит строку.
Программа должна сосчитать, сколько раз введенная строка встречается в массиве.
 */

package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringArr[] = {"str0", "str1", "str0", "str3", "str0"};

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(i + ". " + stringArr[i]);
        }

        System.out.println("Введите строку");
        String inputStr = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals(inputStr)) {
                count ++;
            }

        }

        System.out.println("Введенная строка встречается " + count + " раз(а).");
    }
}

