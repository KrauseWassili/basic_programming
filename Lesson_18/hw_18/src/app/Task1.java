/*
Wassili Krause HW_18_1 cochort_68M
Задача 1
Напишите программу, которая просит пользователя ввести строку и выводит на экран первое слово введенной строке, по-буквам, в столбик. Задачу необходимо реализовать двумя видами цикла из трех.

Например:

hello java

h
e
l
l
o
Copy
Ограничения:

если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring

 */

package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");

        String firstWord = scanner.next();

        int index = 0;
        while (index < firstWord.length()) {
            System.out.println(firstWord.charAt(index));
            index++;
        }

        System.out.println("--------------------");
        for (index = 0; index < firstWord.length(); index++) {
            System.out.println(firstWord.charAt(index));
        }

    }
}
