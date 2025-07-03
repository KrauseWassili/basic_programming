/*
Задача 1
Создайте класс книга Book (String title, String author). Создайте список из книг.
Реализуйте метод, который считает сколько раз заданная книга встречается в списке.
*/

package app1;

public class Main {
    public static void main(String[] args) {

        BookService.createBookList();                                       //Создаем список книг
        BookService.printBookList(BookService.getBookList());               //Распечатываем его

        Book wantedBook = BookService.enterBookByNumber(BookService.getBookList());     //Получаем разысквиваемую книгу по введенному номеру (будем искать книгу по полному совпадению названия и автора)

        int booksNumber = BookService.getBooksNumber(BookService.getBookList(),wantedBook); //Получаем количество книг, совпадающих с выбранной книгой

        System.out.println("Выбранная книга встречается в списке " + booksNumber + " раз(а).");
    }
}
