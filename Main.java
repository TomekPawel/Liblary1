import dao.BookDao;
import dao.BookDaoSqlLite;
import domain.Book;

/**
 * Created by gosc on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pozytywne myślenie", "Brian Tracy",1,456);
        Book goebel1 = new Book("Topics in metric fixed point theory", "Kazimierz Goebel",2);
        BookDao bookDao;

        bookDao = new BookDaoSqlLite();
        bookDao.addBook(book1);
    }
}
