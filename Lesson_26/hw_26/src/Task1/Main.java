/*
Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники. Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст Реализуйте конструктор,
toString() Реализуйте метод, который позволяет создать объект Pet используя Scanner
 */

package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pet newPet1 = Pet.enterNewPet();

        System.out.println(newPet1);
    }



}
