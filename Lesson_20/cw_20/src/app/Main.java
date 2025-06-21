package app;

public class Main {
    public static void main(String[] args) {

        int[] intArray ={45,25,46,43,15};
        System.out.println(intArray[0]);

        intArray[0] +=intArray[1];

        //intArray.length - длина массива
        System.out.println("Количество элементов в массиве:" + intArray.length);
        System.out.println("-------------------------");
        System.out.println("Вывести весь массив:");

        for (int i=0; i<intArray.length; i++){
            System.out.println("[" + i + "] = " + intArray[i] );
        }

    }
}
