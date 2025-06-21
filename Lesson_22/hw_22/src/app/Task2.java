/*
Wassili Krause HW_22_2 cochort_68M

Задача 2
Напишите два метода,

1. int minIndex(int[] arr) метод который получает массив, а возращает индекс минимального элемента в этом массиве
2. int maxIndex(int[] arr) метод который получает массив, а возращает индекс максимального элемента в этом массиве
Используя эти два метода, напишите программу, которая меняет местами минимальный элемент массива с максимальным элементом массива.
 */

package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = {6, 4, 3, 5, 7, 5};
        printArr(arr);
        System.out.println("--------------------------------------------" + minIndex(arr) + " " + maxIndex(arr));

        int minIndexCalculated = minIndex(arr);     //Сохраняем значения, вычесленные в методах, в переменные, чтобы не делать повторные вычисления
        int maxIndexCalculated = maxIndex(arr);     //Иначе эти методы можно было бы напрямую вставить в качестве индексов массивов ниже.

        int buff=arr[minIndexCalculated];
        arr[minIndexCalculated] = arr[maxIndexCalculated];
        arr[maxIndexCalculated]=buff;


        printArr(arr);
    }

    public static int minIndex(int[] arr) {

        int index = 0;
        int buff = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (buff > arr[i]) {
                buff = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int maxIndex(int[] arr) {

        int index = 0;
        int buff = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (buff < arr[i]) {
                buff = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void printArr(int[] arr){               //Вопреки постановке задачи, не удержался и написал третий метод.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

