/*
Задача 1
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг,
количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и,
в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию,
по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort и реализовать несколько Comparator<Person>

 */
package app2;

import app2.Product.ProductUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("В магазине имеются следующие товары:");
        ProductUtils.printProductList();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите критерий сортировки:\n 1. наименование\n 2. цена\n 3. рейтинг\n 4. количество\n 0. завершить");
            int mode = scanner.nextInt();
            if (mode >= 1 && mode <= 4) {
                ProductUtils.sortBy(mode);
                ProductUtils.printProductList();
            }else if (mode <0 || mode > 4){
                System.out.println(mode + "- неверный критерий!");
            }
            else break;
        }
    }
}
