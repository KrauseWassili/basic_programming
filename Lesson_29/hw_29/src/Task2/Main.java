/*
Задача 2
Давайте создадим класс Product. Пусть у нашего продукта будет название и цена. Создайте в программе список из Product,
и выведите его на экран, например так:

1. Хлеб 1.79
2. Молоко 1.05
3. Масло 2.39
4. Колбаса 2.99
5. Рис 0.99

Copy
Реализуйте возможность для пользователя указывать номер позиции, тем самым добавлять продукт в корзину.
Один и тот же продукт может несколько раз быть добавленным в корзину. Если пользователь ввел '0' считаем что ввод закончен.
Система должна распечатать все продукты в корзине и количество и сумму заказа.
*/

package Task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> storeProductList = new ArrayList<>();
        List<Product> basketProductList;

        storeProductList.add(new Product("Хлеб", 1.79));
        storeProductList.add(new Product("Молоко", 1.05));
        storeProductList.add(new Product("Масло", 2.39));
        storeProductList.add(new Product("Колбаса", 2.99));
        storeProductList.add(new Product("Рис", 0.99));

        printListOfProducts(storeProductList);

        basketProductList = enterBasketProductList(storeProductList);

        printListOfProducts(basketProductList);
        printQuantityOfProducts(basketProductList);
        printTotalPriceOfProducts(basketProductList);
    }


    public static void printListOfProducts(List<Product> productList) {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ". " + productList.get(i).getName() + " " + productList.get(i).getPrice());
        }
    }

    public static void printQuantityOfProducts(List<Product> productList) {
        System.out.println("В корзину добавлено " + productList.size() + " продукта(ов).");
    }

    public static void printTotalPriceOfProducts(List<Product> productList) {
        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        System.out.println("Общая сумма товаров в корзине составляет " + totalPrice + " у.е.");
    }

    public static List<Product> enterBasketProductList(List<Product> storeProductList) {
        List<Product> basketProductList = new ArrayList<>();
        System.out.println("Введите номера продуктов, чтобы добавить их в корзину.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int inputProductNumber = scanner.nextInt();
            if (inputProductNumber > 0 && inputProductNumber <= storeProductList.size()) {
                basketProductList.add(storeProductList.get(inputProductNumber - 1));
            }
            if (inputProductNumber == 0) {
                break;
            }
        }
        return basketProductList;
    }
}
