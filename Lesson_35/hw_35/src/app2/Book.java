package app2;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList;

    public Book(String title, List<Author> authorList) {
        this.title = title;
        this.authorList = authorList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public String toString(){
        String res = title;
        for (Author author : authorList)
            res += " - " + author.getAuthorFirstName() + " " + author.getAuthorLastName() + " " + author.getYear() + "; ";
        return res;
    }
}

