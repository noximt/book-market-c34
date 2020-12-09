package by.bookmarket.dao.book;

import by.bookmarket.entity.book.Book;
import by.bookmarket.entity.book.BookStatus;
import by.bookmarket.entity.book.Format;
import by.bookmarket.entity.book.Genre;

import java.util.List;

public interface BookDao {
    boolean save(Book book);
    public boolean saveFirst(Book book);

    List<Book> getAll();

    Book getById(long id);

    Book getByBookName(String bookName);

    boolean contains(long id);

    boolean contains(Book book);

    boolean delete(long id);

    String updateBookName(String newBookName, long id);

    String updateAuthor(String newAuthor, long id);

    Format updateFormat(Format newFormat, long id);

    String updatePublisher(String newPublisher, long id);

    int updatePublicationDate(int newDate, long id);

    int updatePages(int newPages, long id);

    Genre updateGenre(Genre newGenre, long id);

    double updateCost(double newCost, long id);

    BookStatus updateBookStatus(BookStatus newBookStatus, long id);

    String updateDescription(String newDescription, long id);
}
