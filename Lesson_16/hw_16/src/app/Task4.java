/*
Wassili Krause HW_16_4 cochort_68M

Задача 4 (по желанию)
Пользователь вводит email ваша задача проверить, может ли введенная строка быть корректным email.
Email корректен если он:

содержит @
длиннее 8 символов
содержит .
@ и . не последний и не первый символ
 */

package app;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите E-Mail: ");
        String email = scanner.nextLine();

        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.indexOf(".");


        boolean isMailValid = email.length() > 8
                && indexOfAt > 0
                && indexOfDot > 0
                && email.lastIndexOf("@") != email.length() - 1
                && email.lastIndexOf(".") != email.length() - 1;

        if (isMailValid){
            System.out.println("Вы ввели корректный адрес E-Mail!");
        }else {
            System.out.println("Ошибка ввода адреса E-Mail!");
        }


    }
}