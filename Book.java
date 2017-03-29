package domain;

/**
 * Created by gosc on 20.03.2017.
 */
public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String title, String author, int id, int pages) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.pages = pages;
    }

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    private String title;
    private String author;
    private int id;
    private int pages;
}
