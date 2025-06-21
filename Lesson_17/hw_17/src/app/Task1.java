/*
Wassili Krause HW_18_1 cochort_68M
Задача 1
Напишите программу, которая просит пользователя ввести строку и выводит на экран первое слово введенной строке, по-буквам, в столбик. Задачу необходимо реализовать двумя видами цикла из трех.

Например:

hello java

h
e
l
l
o
Copy
Ограничения:

если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring

 */

package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");

        int month = scanner.nextInt();

        System.out.print("Месяц под номером " + month + ": ");

        switch (month){
            case 1: System.out.println("Январь");       break;
            case 2: System.out.println("Февраль");      break;
            case 3: System.out.println("Март");         break;
            case 4: System.out.println("Апрель");       break;
            case 5: System.out.println("Май");          break;
            case 6: System.out.println("Июнь");         break;
            case 7: System.out.println("Июль");         break;
            case 8: System.out.println("Август");       break;
            case 9: System.out.println("Сетнябрь");     break;
            case 10: System.out.println("Октябрь");     break;
            case 11: System.out.println("Ноябрь");      break;
            case 12: System.out.println("Декабрь");     break;

            default:
                System.out.println("Ошибка ввода");
        }


    }

}
