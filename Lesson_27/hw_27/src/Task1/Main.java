/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов: title (название), author (автор), genre (жанр), yearOfPublished (год издания). Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры

Задача 2
Реализуйте класс BookArray, который управляет массивом книг. Класс должен позволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит, есть ли книга с заданным названием в массиве
 */

package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Book[] books = {
                new Book("Евгений Онегин", "А.С. Пушкин", "роман", 1867),
                new Book("Отцы и дети", "И.С. Тургенев", "роман", 1861),
                new Book("Радуница", "С.А. Есенин", "стихи", 1916),
                new Book("Дюна", "Ф. Герберт", "научная фантастика", 1963),
                new Book("Дворянское гнездо", "И.С. Тургенев", "роман", 1856)
    };
        BookArray bookArray = new BookArray(books);

        System.out.println(bookArray); //Выводим весь массив

        System.out.println("Введите комбинацию букв имени автора книги для поиска:");
        String autorInput = scanner.nextLine();
        System.out.println(bookArray.getBookListByAutor(autorInput));

        System.out.println("Введите комбинацию букв названия книги для поиска:");
        String titelInput = scanner.nextLine();
        System.out.println(bookArray.searchBookByTitel(titelInput));
    }



}