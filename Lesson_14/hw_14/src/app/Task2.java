/*
Wassili Krause HW_14_2 cochort_68M

Задание 2
Обратная задача. Исходные данные программы: строка вида

Николай Иванович Петров
Copy
Написать программу, которая разбирает строку на три переменные:

имя
отчество
фамилия
Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()
 */

package app;

public class Task2 {

    public static void main(String[] args){

        String fullName     = "Николай Иванович Петров";

        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex  = fullName.lastIndexOf(" ");

        //Называется "Парсинг строки"
        String name         = fullName.substring(0,firstSpaceIndex);
        String patronymic   = fullName.substring(firstSpaceIndex+1,lastSpaceIndex);
        String surname      = fullName.substring(lastSpaceIndex+1);


        System.out.println(name + "\n" + patronymic + "\n" + surname);

    }
}
