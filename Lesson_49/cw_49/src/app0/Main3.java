package app0;

public class Main3 {
    public static void main(String[] args) throws Exception{

        int i = m1(0);
        System.out.println(i);

    }

    public static int m1(int a) throws Exception{
        System.out.println("m1: начал работу");
        if (a==0){
            throw new Exception();
        }
        System.out.println("m1: завершил работу");
        return a;
    }



}
