package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int i = readInt();
        System.out.printf("Вы ввели: %d" , i);

    }

    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        try {
            int i = scanner.nextInt();
            return i;
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("! Внимательнее");
            return readInt();
        }

    }

}