/*
Wassili Krause HW_22_3 cochort_68M

Задача 3 (сложнее, по желанию)
Напишите метод boolean checkDate(int day, int month, int year) который получает 3 значения int, день, месяц и год и определяет, могут ли быть эти значения корректной датой.

checkDate(10,1,2008) - true
checkDate(10,15,2008) - false
checkDate(10,-1,2008) - false
 */

package app;


public class Task3 {
    public static void main(String[] args) {

        System.out.println(checkDate(16,6,2025));
    }

    public static boolean checkDate(int day, int month, int year) {
        int maxDay = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDay = 31;
                break;
            case 4, 6, 9, 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
            default:

        }
        return (day >= 1 && day <= maxDay && month >= 1 && month <= 12 && year >= 1000 && year <= 9999); //Пределы года нужно подбирать в зависимости от контекста.

    }
}

