/*
Wassili Krause HW_21_3 cochort_68M

Задача 3
Дан массив int. Написать программу, которыя ищет самый маленький элемент массива и меняет его с первым элементам (т.е. с элементом с индексом 0) Потом меняет местами второй самый маленький элемент
с элементом с индексом 1. Например: Например: {10,5,-1,4,14} -> {-1,4,10,5,14}
 */

package app;


public class Task3 {
    public static void main(String[] args) {

        int[] numArr = {10, 5, -1, 4, 14};

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + ",");
        }

        System.out.println("\n-----------------------");

        int buf = numArr[0];
        int indexOfMin = 0;
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[0] > numArr[i]) {
                numArr[0] = numArr[i];
                indexOfMin = i;
            }
        }
        numArr[indexOfMin] = buf;

        buf = numArr[1];
        indexOfMin = 1;
        for (int i = 2; i < numArr.length; i++) {
            if (numArr[1] > numArr[i]) {
                numArr[1] = numArr[i];
                indexOfMin = i;
            }
        }
        numArr[indexOfMin] = buf;

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + ",");

        }
    }
}

