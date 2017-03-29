package dao;

import domain.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gosc on 20.03.2017.
 */
public class BookDaoSqlLite implements BookDao {

    private Connection connection;

    public BookDaoSqlLite(){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:library.db");
        } catch (Exception e){
            e.printStackTrace();
        }
        createTable();
     //   addBook();
    }

    public void addBook(Book book){
        String title = book.getTitle();
        String author = book.getAuthor();
        int pages = book.getPages();
        String newBookSQL = "INSERT INTO Books(title, author, pages )" +
                "VALUES("
                +"'"+title+"', '"+author+"', "+pages+")";

        try {
            Statement b = connection.createStatement();
            b.execute(newBookSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeBook(Book book) {
        String title = book.getTitle();
        String author = book.getAuthor();
        int id = book.getId();
        String removeBookSQL = "DELETE FROM Books WHERE 'id'"+"=id";
    }

    private void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS Books("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "title TEXT , "
                + "author TEXT ,"
                + "pages INTEGER DEFAULT 0"
                + ")";
        try {
            Statement s = connection.createStatement();
            s.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
