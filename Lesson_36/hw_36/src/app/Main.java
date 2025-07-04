/*
Задача 1
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг,
количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и,
в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию,
по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort и реализовать несколько Comparator<Person>

 */
package app;

import app.Product.ProductUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("В магазине имеются следующие товары:");
        ProductUtils.printProductList();

        System.out.println("Выберите критерий сортировки:\n 1. наименование\n 2. цена\n 3. рейтинг\n 4. количество");
        Scanner scanner = new Scanner(System.in);
        ProductUtils.sortBy(scanner.nextInt());
        ProductUtils.printProductList();
    }
}
