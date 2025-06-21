/*
Wassili Krause HW_16_2 cochort_68M

Задача 2
В программе заданно 2 переменных: adminLogin и adminPass. Пользователь вводит свои логин и пароль.
Если введенные логин и пароль совпадают с adminLogin и adminPass, программа выдает сообщение:
"доступ возможен", иначе "вы не опознаны"
 */

package app;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adminLogin = "qwer";
        String adminPass = "asdf";


        System.out.println("Введите Login: ");
        String login = scanner.nextLine();

        System.out.println("Введите Password: ");
        String pass = scanner.nextLine();

        if (login.equals(adminLogin) && pass.equals(adminPass)) {
            System.out.println("Доступ возможен!");

        }else{
            System.out.println("Вы не опознаны!");
        }

    }
}

