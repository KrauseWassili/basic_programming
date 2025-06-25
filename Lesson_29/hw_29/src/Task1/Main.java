/*
Задача 1
Напишите программу, которая позволяет пользователю вводить целые числа.
Как только пользователь введет 0 - считаем что ввод закончен. Программа должна вывести на экран все введенные числа и их сумму
*/

package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        System.out.println("Введите произвольное количество целых чисел. Для завершения введите число 0");
        integerList = enterIntegerList();

        printIntegerList(integerList);
        printSummAllIntegerFromList(integerList);

    }

    public static List<Integer> enterIntegerList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        int inputInteger;
        while (true) {
            inputInteger = scanner.nextInt();
            if (inputInteger != 0) {
                res.add(inputInteger);
            } else {
                return res;
            }
        }
    }

    public static void printIntegerList(List<Integer> integerList) {
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
    public static void printSummAllIntegerFromList(List<Integer> integerList) {
        int summ = 0;
        for (Integer integer : integerList) {
            summ += integer;
        }
            System.out.println("Сумма всех чисел в списке равна " + summ);
    }
}
