/*
Задача 2
Создайте класс книга Book (String title, List<Author> authors). В отличие от первой задачи, авторов может быть много,
и Author - объект из 3х полей (firstName, lastName, int year) Создайте список из книг.
Реализуйте метод, который формирует список книг заданного автора (т.е. если автор встречается в списке авторов книги,
книга должна попасть в итоговый список)
 */

package app2;

public class Main {
    public static void main(String[] args) {

        BookService.createBookList();
        BookService.printBookList(BookService.getBookList());


        BookService.printBookList(BookService.searchBooksByAuthor());



    }
}
