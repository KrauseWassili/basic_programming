package app;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        long sum = 0;
        while (true) {
            System.out.println("Введите целое число или 0 для завершения");
            int num1 = scanner.nextInt();
            sum += num1;
            if (num1 == 0) {
                break;
            }
        }
        System.out.println("Сумма введенных чисел равна " + sum);
    }
}

