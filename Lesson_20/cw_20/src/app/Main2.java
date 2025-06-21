package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"jack jackson", "lena schuman", "ira brown", "vlad petrov" }; // объявляем пустой массив на 10 элементов int

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        String[] shortNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            shortNames[i] = name.charAt(0)+". " + name.substring(name.indexOf(" "));
        }
        System.out.println("Результат:");
        for (int i = 0; i < shortNames.length; i++) {
            System.out.println(shortNames[i]);
        }
    }
}
