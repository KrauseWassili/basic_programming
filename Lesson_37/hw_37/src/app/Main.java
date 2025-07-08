/*
Задание 1
Осознать код, написанный на занятии.
На занятие завтра мы продолжим его дорабатывать.
По образу и подобию (можно смотреть в код написанный на занятие)
написать свою реализацию листов которая позволяет хранить Product (из задачи про магазин)

Задание 2
Добавить в код написанный в классе метод indexOf(Person person), который возвращает индекс заданного person в нашем списке. Если такого person нет - возвращаем null

Задание 3 (сложнее, по желанию)
Добавить в код написанный в классе метод add(Person person, int index), который добавляет person в заданную позицию index. Если index >= size, добавляем в конец списка, если index <= 0 добавляем в начало списка
 */

package app;

public class Main {
    public static void main(String[] args) {
        MyList productList = new MyLinkedList();

        productList.add(new Product("Стол", 143.8, 8.4, 5));
        productList.add(new Product("Стул", 32.4, 7.6, 22));
        productList.add(new Product("Кресло", 98.3, 9.7, 7));
        productList.add(new Product("Диван", 233.7, 9.5, 3));
        productList.add(new Product("Ковер", 56.1, 5.3, 9));

        Product searchedProduct = new Product("Ковер", 56.1, 5.3, 9);

        System.out.println(productList);

        System.out.println("Номер разыскиваемого продукта: " + productList.indexOf(searchedProduct));


    }
}
