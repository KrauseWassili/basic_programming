/*
Wassili Krause HW_17_2 cochort_68M
Задача 2
Напишите программу, которая просит пользователя ввести два числа и выбрать операцию умножить, сложить, умножить или поделить. В качестве результата система должна выводить строку вида:

3 * 3 = 9
естественно, числа и операция должны зависить от введенных данных.
 */

package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        double res;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Введите операцию (+,-,*,/): ");
        String operation = scanner.nextLine();


        switch (operation) {
            case "+":
                res = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + res);
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + res);
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
            default:
                System.out.println("Неверный оператор");
        }

    }

}
