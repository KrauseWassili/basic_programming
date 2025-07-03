package app2;

import app2.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private static List<Book> bookList = new ArrayList<>();
    private static List<Author> authorList = new ArrayList<>();
    private static List<String> titleList = new ArrayList<>();

    public static List<Book> getBookList() {
        return bookList;
    }

    public static void createAuthorList() {
        authorList.add(new Author("Джорж", "Оруэлл", 1903));
        authorList.add(new Author("Эрнест", "Хемингуэй", 1899));
        authorList.add(new Author("Джейн", "Остин", 1775));
        authorList.add(new Author("Лев", "Толстой", 1828));
        authorList.add(new Author("Фёдор", "Достоевский", 1821));
        authorList.add(new Author("Харуки", "Мураками", 1949));
        authorList.add(new Author("Габриэль", "Гарсия", 1927));
        authorList.add(new Author("Агата", "Кристи", 1890));
        authorList.add(new Author("Джоан", "Роулинг", 1965));
        authorList.add(new Author("Стивен", "Кинг", 1947));
    }

    public static void createTitleList() {
        titleList.add("Евгений Онегин");
        titleList.add("Отцы и дети");
        titleList.add("Радуница");
        titleList.add("Дюна");
        titleList.add("Дворянское гнездо");
    }

    //Допустим, у книги может быть максимум 3 автора:

    public static Book createBook(String title, Author author1, Author author2, Author author3) {
        List<Author> authorList = new ArrayList<>();
        if (author1 != null) authorList.add(author1);
        if (author2 != null) authorList.add(author2);
        if (author3 != null) authorList.add(author3);
        return new Book(title, authorList);
    }

    //За факт написания книг приведенными в списке авторами не ручаюсь, книги созданы случайным образом
    public static void createBookList() {
        createAuthorList();
        createTitleList();
        bookList.add(createBook(titleList.get(0), authorList.get(2), authorList.get(3), authorList.get(4)));
        bookList.add(createBook(titleList.get(1), authorList.get(3), authorList.get(4), null));
        bookList.add(createBook(titleList.get(2), authorList.get(4), authorList.get(5), authorList.get(6)));
        bookList.add(createBook(titleList.get(3), authorList.get(5), authorList.get(7), null));
        bookList.add(createBook(titleList.get(4), authorList.get(6), null, null));
    }

    public static List<Book> searchBooksByAuthor() {
        List<Book> res = new ArrayList<>();
        System.out.println("Введите автора для поиска книг:");
        Scanner scanner = new Scanner(System.in);
        String searchedAuthor = scanner.nextLine();
        for (Book book : bookList) {
            if (containsAuthor(book, searchedAuthor))
                res.add(book);
        }
        return res;
    }

    public static boolean containsAuthor(Book book, String searchedAuthor) {
        for (Author author : book.getAuthorList()) {
            if (author.getAuthorFirstName().toLowerCase().contains(searchedAuthor.toLowerCase()) ||
                    author.getAuthorLastName().toLowerCase().contains(searchedAuthor.toLowerCase()))
                return true;

        }
        return false;
    }

    public static void printBookList(List<Book> bookList) {
        if (!bookList.isEmpty())
            for (int i = 0; i < bookList.size(); i++) {
                System.out.print((i + 1) + ". ");
                System.out.println(bookList.get(i));
            }
        else
            System.out.println("Книги в списке отсутствуют.");
    }
}

