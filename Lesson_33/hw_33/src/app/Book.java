package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String titel;
    private String author;

    public Book(String titel, String author) {
        this.titel = titel;
        this.author = author;
    }

    public static String enterAuthor() {
        System.out.println("Введите автора для поиска книг:");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static List<String> enterAuthorList() {
        List<String> res = new ArrayList<>();
        System.out.println("Введите авторов, для завершения введите 0:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String author = scanner.nextLine();
            if (!author.equals("0"))
                res.add(author);
            else
                break;
        }
        return res;
    }

    public static List<Book> getBooksByAuthorList(List<Book> bookList, List<String> authorList) {
        List<Book> res = new ArrayList<>();

        for (Book book : bookList)
            for (String author : authorList) {
                if (book.author.toLowerCase().contains(author.toLowerCase()))
                    res.add(book);
            }
        return res;
    }

    public static List<Book> getBooksByAuthor(List<Book> bookList, String author) {
        List<Book> res = new ArrayList<>();
        for (Book book : bookList)
            if (book.author.toLowerCase().contains(author.toLowerCase()))
                res.add(book);

        return res;
    }

    public static void printBooks(List<Book> bookList) {
        if (!bookList.isEmpty())
            for (Book book : bookList)
                System.out.println(book.titel + " " + book.author);
        else
            System.out.println("Таких книг нет.");
    }
}
