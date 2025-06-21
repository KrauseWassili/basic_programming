/*
Wassili Krause HW_15_2 cochort_68M

Задание 2
Ваша программа должна (используя Scanner) запросить

имя первого пассажира
количество груза первого пассажира (целое число)
имя второго пассажира
количество груза первого пассажира (целое число)
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Пассажир 1: имя, багаж: xxx
Пассажир 2: имя, багаж: xxx
Всего багажа: yyy
Copy
Естественно, в результат должны подставится введенные данные.

 */

package app;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пассажира: ");
        String passenger1Name = scanner.nextLine();
        //scanner.next() - читает строку, но только до первого проекта

        System.out.println("Введите количество груза первого пассажира: ");

        int passenger1Cargo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя второго пассажира: ");
        String passenger2Name = scanner.nextLine();

        System.out.println("Введите количество груза второго пассажира: ");

        int passenger2Cargo = scanner.nextInt();
        scanner.nextLine();



        System.out.println("Пассажир 1: " + passenger1Name + ", багаж: " + passenger1Cargo);
        System.out.println("Пассажир 2: " + passenger2Name + ", багаж: " + passenger2Cargo);
    }
}

