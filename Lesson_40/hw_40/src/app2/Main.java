/*
Задание 2 (по желанию)
Помните проект про сортировку товаров разными способами? Перепишите его используя анонимные классы
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
            System.out.println("Выберите критерий сортировки:\n 1. наименование\n 2. цена по возрастанию\n 3. цена по убыванию\n 4. рейтинг\n 5. количество\n 0. завершить");
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
