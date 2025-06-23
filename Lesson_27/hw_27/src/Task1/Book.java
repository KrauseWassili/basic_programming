package Task1;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int yearOfPublishes;

    public Book(String title, String author, String genre, int yearOfPublishes) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPublishes = yearOfPublishes;
    }

    public String toString() {
        return "title: " + title +
                " author: " + author +
                " genre: " + genre +
                " year of published: " + yearOfPublishes;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublishes() {
        return yearOfPublishes;
    }
}
