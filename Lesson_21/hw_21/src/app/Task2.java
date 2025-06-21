/*
Wassili Krause HW_21_2 cochort_68M

Задача 2
Дано два массива String[] names и int[ ] yearsOfBirthday одинаковой длинны, которые соответственно содержат имена и годы рождения людей. Каждый элемент в yearsOfBirthday соответствует элементу с таким же индексом в names. Реализовать программу, которая распечатает список людей (имя плюс возраст) , которые старше заданного int. Потом распечатать имя и возраст старейшего: Например:

{“Olga”,”Oleg”,”Svetlana”,”Oleg”}
{2004,1982,2008,”2010”}
15
Copy
результат:

Olga 16 years
Oleg 38 years
_____________
Oleg 38 years is oldest
 */

package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        int currentYear = 2025;
        String[] names = {"Olga", "Oleg", "Svetlana", "Oleg"};
        int[] yearsOfBirthday = {2004, 1982, 2008, 2010};

        System.out.println("Введите возраст, с которого необходимо выводить список лиц.");

        Scanner scanner = new Scanner(System.in);
        int ageInput = scanner.nextInt();


        for (int i = 0; i < names.length; i++) {
            if(currentYear-yearsOfBirthday[i] >= ageInput) {
                System.out.println(names[i] + (currentYear-yearsOfBirthday[i]) + "years");
            }
        }

        System.out.println("________________________________");


        int minYearOfBirthday = yearsOfBirthday[0];
        int oldestPersonIndex = 0;
        for (int i = 1; i < yearsOfBirthday.length; i++) {
            if (minYearOfBirthday > yearsOfBirthday[i]) {
                minYearOfBirthday = yearsOfBirthday[i];
                oldestPersonIndex=i;
            }
        }

        System.out.println(names[oldestPersonIndex] + " " + (currentYear-yearsOfBirthday[oldestPersonIndex]) + " years is oldest.");
    }
}

