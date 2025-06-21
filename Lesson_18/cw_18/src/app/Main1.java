package app;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String str = scanner.nextLine();

        int a = 0;
        while (a <= str.length() - 1) {
            System.out.println(str.charAt(a));
            a++;
        }

        System.out.println("--------------------:");

        for ( a = 0 ; a < str.length() ; a++ ){
            System.out.println( str.charAt(a));
        }

        System.out.println("-----Reverse--------:");

        for ( a = str.length()-1 ; a >= 0 ; a-- ){
            System.out.println( str.charAt(a));
        }

        System.out.println("Строка без l:");

        String result = "";

        a=0;
        while (a < str.length()){
            if(str.charAt(a) != 'l'){
                result += str.charAt(a);

            }
            a++;
        }

        System.out.println(result);

    }
}
