/*
Wassili Krause HW_13_1 cochort_68M

Задание 1
Создайте новый модуль. В модуле создайте package c названием app.
Создайте новый класс. Создайте метод main.
Исходные данные: Цена за один билет в кино составляет 4 у.е. У вас 19 у.е.

Напишите программу, которая сохраняет эти данные в переменных, вычисляет и выводит в консоль,
сколько билетов вы можете купить. Сколько денег у вас останется, после покупки
максимально возможного количества билетов.
*/

package app;

public class Exercise_1 {
    public static void main(String[] args){
        int ticketPrice = 4;
        int money = 19;
        int maxPossibleTicketsNumber;
        int remainingMoney;


        remainingMoney = money % ticketPrice;
        maxPossibleTicketsNumber = money / ticketPrice;

        System.out.println("На " + money + " у.е. можно купить " + maxPossibleTicketsNumber + " билета(ов) по " + ticketPrice + " у.е.,");
        System.out.println("после чего останется " + remainingMoney + " у.е.");
    }
}


