package app;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(m1(0));
    }

    public static int m1(int a){
        System.out.println("m1 start");
        try {

            if (a==0){
                throw new IllegalArgumentException("qwert");
            }
            return a;

        } catch (Exception e){
            System.out.println("Произошла ошибка");
            return 999;
        } finally {
            System.out.println("выполнили finally!!!");
        }
    }


}
