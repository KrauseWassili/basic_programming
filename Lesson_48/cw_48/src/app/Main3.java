package app;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try {
            int i = readInt();
            System.out.printf("Вы ввели: %d" , i);
        } catch (Exception e){
            System.out.println("Введено некорректное значение");
        }

    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");

        int i = scanner.nextInt();
        System.out.println("нормальный ввод");
        return i;
    }



}
