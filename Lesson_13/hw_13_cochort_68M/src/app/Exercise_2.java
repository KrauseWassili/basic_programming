/*

Wassili Krause HW_13_2 cochort_68M
Задание 2
Создайте новый класс. Создайте метод main. Объявите 2 переменные:

цена товара без налога;
налог
Напишите программу, которая вычисляет цену товара с налогом

Например, так:

Введите цену товара: 200.0
Налог составит: 19
Цена с налогом 238.0
 */

package app;

public class Exercise_2 {
    public static void main(String[] args){
        double productPriceWithoutTax = 200.0;
        double tax = 19;
        double productPriceWithTax;


        productPriceWithTax = productPriceWithoutTax + (productPriceWithoutTax * tax / 100);

        System.out.println("Цена товара: " + productPriceWithoutTax);
        System.out.println("Налог составит: " + tax);
        System.out.println("Цена с налогом: " + productPriceWithTax);
    }
}
