/*
Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники. Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст Реализуйте конструктор,
toString() Реализуйте метод, который позволяет создать объект Pet используя Scanner
 */

package Task2;

public class Main {
    public static void main(String[] args) {
        int petsArrSize = 10;

        Pet[] petsArr = new Pet[petsArrSize];

        Pet.enterPetsArr(petsArr, petsArrSize);

        Pet.printPetsArr(petsArr, petsArrSize);

        Pet.ageStatistic(petsArr, petsArrSize);
    }


}
