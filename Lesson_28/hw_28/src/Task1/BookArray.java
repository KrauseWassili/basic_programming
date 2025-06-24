package Task1;

public class BookArray {
    private int capacity = 2;
    private int size = 0;
    private Book[] arr;

    public BookArray() {
        this.arr = new Book[capacity];
    }


    public void addNewBook(Book newBook) {

        if (size >= arr.length) {
            enlarge();
        }

        arr[size] = newBook;
        size++;
    }

    public void enlarge() {
        Book[] newArr = new Book[size * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


    public String toString() {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                break;
            }
            res += arr[i] + System.lineSeparator();

        }
        return res;
    }

    public Book getBook(int index) {
        return arr[index];
    }

    public String getBookListByAuthor(String author) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (getBook(i) != null && getBook(i).getAuthor().contains(author)) {
                res += getBook(i) + System.lineSeparator();
            }
        }
        if (!res.isEmpty()) {
            return res;
        } else {
            return "Таких авторов нет.";
        }
    }

    public String searchBookByTitel(String titel) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {

            if (getBook(i) != null && getBook(i).getTitle().contains(titel)) {
                res += getBook(i) + "\n";
            }
        }
        if (!res.isEmpty()) {
            return "Книга с комбинацией букв \"" + titel + "\" в названии имеется в массиве.";
        } else {
            return "Такой книги нет.";
        }
    }
}
