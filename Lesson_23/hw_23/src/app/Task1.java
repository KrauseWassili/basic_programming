/*
Wassili Krause HW_23_1 cochort_68M

Задача 1
Написать метод, который создает и возвращает новый массив который является копией исходного, но в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */

package app;

public class Task1 {
    public static void main(String[] args) {

        int[] arr1 = {10, 3, 3, 5, -9};
        int[] arr2 = arrReverse(arr1, arr1.length);

        printArr(arr1);
        printArr(arr2);

    }

    public static int[] arrReverse(int[] arr1, int arr1Length) {
        int[] arr2 = new int[arr1Length];
        for (int i = 0; i < arr1Length; i++) {
            arr2[i] = arr1[arr1Length - i-1];
        }
        return arr2;
    }

    public static void printArr(int[] arr){               //Вопреки постановке задачи, не удержался и написал третий метод.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
