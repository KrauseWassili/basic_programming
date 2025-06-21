package app;

public class Main3 {
    public static void main(String[] args) {

        boolean isMorning = false;
        boolean isEvening = true;

        boolean isSummer = true;
        boolean isWinter = false;


        System.out.println("isMorning || is Evening = " + (isMorning || isEvening));  //true
        System.out.println("isMorning || is Evening = " + (isMorning && isEvening));  //false

        boolean isSummerOrWinterEvening = isWinter && isEvening || isSummer && isEvening;
        System.out.println("isWinter && isEvening || isSummer && isEvening = " + isSummerOrWinterEvening);  //false


        if (isSummerOrWinterEvening) {
            System.out.println("сейчас летний или зимний вечер");

        }else{
            System.out.println("мерзнем");
        }
    }
}
