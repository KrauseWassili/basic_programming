/*
Задача 2
Используя написанные в задаче 1 классы и методы напишите программу,
которая позволяет ввести несколько домашних животных и формирует из них массив. Выведите этот массив на экран.

Задача 3 (по желанию)
реализуйте метод (или методы), которые позволят получить статистику по базе животных:
пользователь вводит тип животного, например "собака",
программа должна вывести количество собак в массиве и их средний возраст.
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
