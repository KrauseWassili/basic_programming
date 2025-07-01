/*
/*
HW_33_TEXT
1. Создайте класс Book (название, автор). Создайте ArrayList<Book>.
Добавьте туда несколько объектов.
Напишите метод `ArrayList<Book> getBook (ArrayList<Book> list, String author)`
который возвращает список книг, заданного автора.
Распечатайте его из мейна.
1.2 adv.
Предусмотрите в задаче 1. возможность поиска книг по списку авторов для
конкретной книги НАПРИМЕР
Илья Ильф, Евгений Петров
Борис Стругацкий, Аркадий Стругацкий
 */

package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Евгений Онегин", "А.С. Пушкин"));
        bookList.add(new Book("Отцы и дети", "И.С. Тургенев"));
        bookList.add(new Book("Радуница", "С.А. Есенин"));
        bookList.add(new Book("Дюна", "Ф. Герберт"));
        bookList.add(new Book("Дворянское гнездо", "И.С. Тургенев"));

        Book.printBooks(Book.getBooksByAuthor(bookList,Book.enterAuthor()));

        Book.printBooks(Book.getBooksByAuthorList(bookList,Book.enterAuthorList()));
    }


}
