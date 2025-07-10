/*
Задание 1
В проекте с нашей реализацией листов, реализуйте Iterator у MyLinkedList с помощью анонимного класса

Задание 2 (по желанию)
Помните проект про сортировку товаров разными способами? Перепишите его используя анонимные классы
 */
package app1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Person> linkedList = new MyLinkedList<>();
        linkedList.add(new Person("Valentin", 12));
        linkedList.add(new Person("Semion", 13));
        linkedList.add(new Person("Boris", 14));
        linkedList.add(new Person("Taras", 15));
        linkedList.add(new Person("Anton", 16));


        Iterator<Person> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
