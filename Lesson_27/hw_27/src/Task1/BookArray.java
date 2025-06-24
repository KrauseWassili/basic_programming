package Task1;

public class BookArray {

    private Book[] arr;

    public BookArray(Book[] arr){
        this.arr = arr;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + "\n";
        }
        return res;
    }

    public String getBookListByAutor(String author){
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAuthor().contains(author)) {
                res += arr[i] + System.lineSeparator();
            }
        }
        return res;
    }

    public String searchBookByTitel(String titel) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTitle().contains(titel)) {
                res += arr[i] + "\n";
            }
        }
        if (!res.isEmpty()) {
            return "Книга с комбинацией букв \"" + titel + "\" в названии имеется в массиве.";
        } else {
            return "Такой книги нет.";
        }
    }
}
