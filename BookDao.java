package dao;

import domain.Book;

/**
 * Created by gosc on 20.03.2017.
 */
public interface BookDao {
    void addBook(Book book);
    void removeBook(Book book);
}
