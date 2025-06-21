/*
Wassili Krause HW_17_1 cochort_68M
Задача 3 (сложнее, по желанию)
пользователь вводит строку вида:

22 + 6
Copy
в рамках данной задачи:

в выражение только 2 целых положительных числа
числа отделены одним пробелом от знака операции
возможные операции + - / *
пользователь вводит корректные данные, т.е. проверять эти условия не нужно

 */

package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int res;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение для вычисления: ");

        String expression = scanner.nextLine();

        int firstSpace = expression.indexOf(" ");
        int lastSpace = expression.lastIndexOf(" ");

        //Здесь по идее необходимо сделать массу проверок на верность ввода строки. Но, думаю, задача сейчас не на это.

        String strNum1 = expression.substring(0,firstSpace);
        String strNum2 = expression.substring(lastSpace+1);
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        String operation = expression.substring(firstSpace+1,lastSpace);

//switch взял из предыдущего задания
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
