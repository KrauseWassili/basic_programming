package app0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = m1(111);
        System.out.println(i);

    }

    public static int m1(int a){
        System.out.println("m1: начал работу");
        if (a == -123){
            // исключительная ситуация
            throw new RuntimeException("m1: exception!!!");
        }
        try {
            a = m2(a);
        } catch (IllegalArgumentException e){
            //SMS
        } catch (Exception e){
            System.out.println("       Перехватили!!:   " + e.getMessage() );

        }



        System.out.println("m1: завершил работу");
        return a;
    }
    public static int m2(int a){
        System.out.println("  m2: начал работу");
        if (a == 111){
            throw new NadoeloRabotatException("m2: Exception!");
        }
        Scanner scanner = new Scanner(System.in);

        a= a + scanner.nextInt();
        System.out.println("  m2: завершил работу");
        return a;
    }

}
