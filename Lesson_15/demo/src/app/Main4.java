package app;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        //Создаем объект Scanner для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String numStr = scanner.nextLine();         //Получаем число строкой
        int i = Integer.parseInt(numStr);           //Преобразуем строку в число
        System.out.println("Число: " + i);

        System.out.println("Введите строку: "); //Проблема в том, что после ввода числа в потоке остается символ перевода строки
        String str = scanner.nextLine();
        System.out.println("Строка: " + str);

        System.out.println("------------------------finish----------------------------");

    } //Исправление в Main3
}
