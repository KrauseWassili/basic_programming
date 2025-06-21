/*
Wassili Krause HW_19_3 cochort_68M

Задача 3 (сложнее, по желанию)
Пользователь вводит целое число. Ваша задача определить, сумму разрядов этого числа.
Например, ввели число 2317
Нужно посчитать: 2 + 3 + 1 + 7
Ответ: 13
 */

package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        long sum = 0;
        while (num != 0) {

            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма разрядов равна " + sum);
    }
}

