/*
Wassili Krause HW_20_1 cochort_68M

Задача 1
Реализовать программу, которая просит пользователя ввести 5 имен, создает массив с этими именами и выводит их на экран:
Ввод:

jack
jonh
ann
lena
nick
Copy
Вывод:

0.jack
1.jonh
2. ann
3.lena
4.nick
 */

package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] nameArr = new String[5];


        for (int i = 0; i < nameArr.length; i++) {
            System.out.println("Введите имя " + i + ": ");
            nameArr[i] = scanner.nextLine();
        }

        for (int i = 0; i < nameArr.length; i++) {
            System.out.println(i + ". " + nameArr[i]);
        }

    }
}
