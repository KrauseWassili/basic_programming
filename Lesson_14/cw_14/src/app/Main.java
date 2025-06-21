package app;

public class Main {
    public static void main(String[] args){

        long a = 12345678998764L;
        long b = 1_234_566_787;
        float f = 12345456788F;
        boolean isOk = false; // true / false


        int i1 = 10; //
        double d1 = i1; // Неявное преобразование типа, Implicit / Widening


        double d2 = 19.333;
        int i2 = (int) d2; // Явное преобразование типа, Explicit / Narrowing

        char ChA = 'A';
        int intChA = (int) ChA;

        System.out.println(intChA);
        System.out.println((char) (intChA));
        System.out.println((char) (intChA + 1));

    }
}
