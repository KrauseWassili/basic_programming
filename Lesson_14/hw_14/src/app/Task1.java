/*
Wassili Krause HW_14_1 cochort_68M

Задание 1
Исходные данные программы:

имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строку вида:

Николай Иванович Петров (Н.И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятии
 */

package app;

public class Task1 {
    public static void main(String[] args){

        String name         = "Николай";
        String patronymic   = "Иванович";
        String surname      = "Петров";
//        String initial1     = name.charAt();
//        String initial2     = patronymic.charAt(0);

        System.out.println(name + " " + patronymic + " " + surname + " (" + name.charAt(0) + "." + patronymic.charAt(0) + ". " + surname +")");




    }
}
