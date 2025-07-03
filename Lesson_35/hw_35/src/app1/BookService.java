package app1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private static List<Book> bookList = new ArrayList<>();

    public static List<Book> getBookList() {
        return bookList;
    }

    public static Book enterBookByNumber(List<Book> bookList) {
        System.out.println("Введите номер разыскиваемой книги:");
        Scanner scanner = new Scanner(System.in);
        int enterNumber = scanner.nextInt();
        return (enterNumber > 0 && enterNumber <= bookList.size())
                ? bookList.get(enterNumber - 1)
                : null;
    }

    public static int getBooksNumber(List<Book> bookList, Book searchedBook) {
        int res = 0;
        for (Book book : bookList)
            if (book.equals(searchedBook))
                res++;
        return res;
    }

    public static void createBookList() {
        bookList.add(new Book("Евгений Онегин", "А.С. Пушкин"));
        bookList.add(new Book("Отцы и дети", "И.С. Тургенев"));
        bookList.add(new Book("Радуница", "С.А. Есенин"));
        bookList.add(new Book("Дюна", "Ф. Герберт"));
        bookList.add(new Book("Дворянское гнездо", "И.С. Тургенев"));
        bookList.add(new Book("Евгений Онегин", "А.С. Пушкин"));
        bookList.add(new Book("Отцы и дети", "И.С. Тургенев"));
        bookList.add(new Book("Дюна", "Ф. Герберт"));
        bookList.add(new Book("Евгений Онегин", "А.С. Пушкин"));
        bookList.add(new Book("Отцы и дети", "И.С. Тургенев"));
        bookList.add(new Book("Радуница", "С.А. Есенин"));
        bookList.add(new Book("Дворянское гнездо", "И.С. Тургенев"));
    }

    public static void printBookList(List<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println((i + 1) + ". " + bookList.get(i).title + " " + bookList.get(i).author);
        }
    }
}
