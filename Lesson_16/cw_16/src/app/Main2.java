package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str3 = scanner.nextLine();

        boolean res1 = str1 == str2;
        boolean res2 = str1 == str3;


        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

        //Строки сравниваем с помощью метода equals()
        // == не всегда работает корректно. Оператор годится только для примитивных типов данных. Происходит сравнение в стековой части памяти

        boolean res3 = str1.equals(str3); // или str3.equals(str1)

        System.out.println("str1.equals(str3) : " + res3);
    }
}
