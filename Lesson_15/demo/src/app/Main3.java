package app;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        //Создаем объект Scanner для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int i = scanner.nextInt();
        scanner.nextLine();                     //Очистить поток ввода
        System.out.println("Число: " + i);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Строка: " + str);

        System.out.println("------------------------finish----------------------------");

    } //Исправление в Main3
}