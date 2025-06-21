package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        switch (var) {
            case value1 :
            case value2 :
            case value3 :
            default:
        }
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch (day){
            case 1: System.out.println("Понедельник");  break;
            case 2: System.out.println("Вторник");      break;
            case 3: System.out.println("Среда");        break;
            case 4: System.out.println("Четверг");      break;
            case 5: System.out.println("Пятница");      break;
            case 6: System.out.println("Суббота");      break;
            case 7: System.out.println("Воскресение");  break;
            default:
                System.out.println("Ошибка ввода");
        }
    }
}
