package app2;

public class Author {
    private String authorFirstName;
    private String authorLastName;
    private int Year;

    public Author(String authorFirstName, String authorLastName, int year) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        Year = year;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getYear() {
        return Year;
    }
}
