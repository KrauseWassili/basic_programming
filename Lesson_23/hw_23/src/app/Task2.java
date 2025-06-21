/*
Wassili Krause HW_23_2 cochort_68M

Задача 2
Написать метод, который разворачивает данный (т.е. исходный) массив в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */
package app;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = {10, 3, 3, 5, -9};

        printArr(arr);
        arrReverse(arr);
        printArr(arr);


    }

    public static void arrReverse(int[] arr) {
        int buff;
        for (int i = 0; i < arr.length / 2; i++) {
            buff = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buff;
        }
    }

    public static void printArr(int[] arr) {               //Вопреки постановке задачи, не удержался и написал третий метод.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
