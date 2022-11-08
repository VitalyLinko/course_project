package productrepository;

import bookmodel.Book;

import java.util.*;

public class PrintedProductRepository {

    private static List<Book> booksList = new ArrayList<>();

    public static List<Book> getBooksList() {
        return booksList;
    }

    public static void setBooksList(List<Book> booksList) {
        PrintedProductRepository.booksList = booksList;
    }
}
