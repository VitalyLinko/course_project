package bookrepository;

import database.DataBase;
import model.Book;

import java.util.List;

public class BookRepository implements Repository{

    private static BookRepository bookRepository;

    private BookRepository() {
    }

    public static BookRepository getBookRepository() {
        if (bookRepository==null){
            bookRepository = new BookRepository();
        }
        return bookRepository;
    }

    @Override
    public Book getNewBook(Book book) {
        return book;
    }

    @Override
    public List<Book> getListOfBooks() {
        return DataBase.getBooks();
    }
}
