/*
Задача 1
По образу и подобию кода написанного на занятие, сделайте из вашего класса BookArray (в проектe про книги) динамический массив.
Т.е. Ваша программа должна позволять пользователю вводить и обрабатывать любое количество книг
При выполнении данного задания не используйте стандартный Java класс ArrayList
*/

package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookArray bookArray = new BookArray();
        bookArray.addNewBook(new Book("Евгений Онегин", "А.С. Пушкин", "роман", 1867));
        bookArray.addNewBook(new Book("Отцы и дети", "И.С. Тургенев", "роман", 1861));
        bookArray.addNewBook(new Book("Радуница", "С.А. Есенин", "стихи", 1916));
        bookArray.addNewBook(new Book("Дюна", "Ф. Герберт", "научная фантастика", 1963));
        bookArray.addNewBook(new Book("Дворянское гнездо", "И.С. Тургенев", "роман", 1856));

        bookArray.addNewBook(new Book("Евгений Онегин", "А.С. Пушкин", "роман", 1867));
        bookArray.addNewBook(new Book("Отцы и дети", "И.С. Тургенев", "роман", 1861));
        bookArray.addNewBook(new Book("Радуница", "С.А. Есенин", "стихи", 1916));
        bookArray.addNewBook(new Book("Дюна", "Ф. Герберт", "научная фантастика", 1963));
        bookArray.addNewBook(new Book("Дворянское гнездо", "И.С. Тургенев", "роман", 1856));

        System.out.println(bookArray);

        System.out.println("Введите комбинацию букв имени автора книги для поиска:");
        String authorInput = scanner.nextLine();
        System.out.println(bookArray.getBookListByAuthor(authorInput));

        System.out.println("Введите комбинацию букв названия книги для поиска:");
        String titelInput = scanner.nextLine();
        System.out.println(bookArray.searchBookByTitel(titelInput));
    }
}
