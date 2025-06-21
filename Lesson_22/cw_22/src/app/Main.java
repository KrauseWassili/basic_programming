package app;
/*
public class Main {
    public static void main(String[] args) {

    }

    public static void method(){

    }

    public static void method1(){

    }
}
*/

public class Main {
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

        printArray(numArr);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}

