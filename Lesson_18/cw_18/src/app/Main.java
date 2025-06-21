package app;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- whlie -----------");

        int a = 0;
        while (a < 3) {
            System.out.println("a = " + a);
            a++;
        }

        System.out.println("---------- for -----------");
        for ( a = 0; a < 3 ; a++ ){
            System.out.println("a = " + a);
        }

       System.out.println("---------- do while -----------");
        a = 0;
        do{
            System.out.println("a = " + a);
            a++;

        } while (a < 3);


    }
}
