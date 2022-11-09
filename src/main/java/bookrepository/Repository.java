package bookrepository;

import model.Book;

import java.util.List;

public interface Repository {

    Book getNewBook(Book book);

    List<Book> getListOfBooks();
}
