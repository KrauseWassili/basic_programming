package app;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5]; // объявляем пустой массив на 10 элементов int

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число с индексом [" + i + "]:");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
