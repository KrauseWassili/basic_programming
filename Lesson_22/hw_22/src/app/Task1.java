/*
Wassili Krause HW_22_1 cochort_68M

Задача 1
Напишите метод void printDate(int day, int month, int year) который получает 3 значения int и выводит на экран дату, следующем виде:

год месяц число
Copy
Например:

printDate(15,1,2008)
Вывод: 2008 январь 15
Copy
в рамках данной задачи предполагаем, что данные корректны
 */

package app;

public class Task1 {
    public static void main(String[] args) {

        printDate(16, 06, 2025);

    }

    public static void printDate(int day, int month, int year) {
        String monthString;
        switch (month) {
            case 1:
                monthString = "январь";
                break;
            case 2:
                monthString = "февраль";
                break;
            case 3:
                monthString = "март";
                break;
            case 4:
                monthString = "апрель";
                break;
            case 5:
                monthString = "май";
                break;
            case 6:
                monthString = "июнь";
                break;
            case 7:
                monthString = "июль";
                break;
            case 8:
                monthString = "август";
                break;
            case 9:
                monthString = "сентябрь";
                break;
            case 10:
                monthString = "октябрь";
                break;
            case 11:
                monthString = "ноябрь";
                break;
            case 12:
                monthString = "декабрь";
                break;

            default:
                monthString = "Месяц указан неверно!";
        }

        System.out.println(year + " " + monthString + " " + day);
    }
}
