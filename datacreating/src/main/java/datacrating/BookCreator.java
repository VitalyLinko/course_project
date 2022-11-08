package datacrating;

import bookmodel.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCreator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static Book bookCreator() {
        Book book = new Book();
        book.setProductName(getBookName());
        book.setBookAuthor(getBookAuthor());
        book.setBookGenre(getBookGenre());
        book.setYearOfWriting(getBookYearOfWriting());
        book.setBookHistory(new ArrayList<>());
        return book;
    }

    private static String getBookName() {
        System.out.print("Enter name of book: ");
        return SCANNER.nextLine();
    }

    private static String getBookAuthor() {
        System.out.print("Enter author of book: ");
        return SCANNER.nextLine();
    }

    private static String getBookGenre() {
        System.out.print("Enter book genre: ");
        return SCANNER.nextLine();
    }

    private static int getBookYearOfWriting() {
        System.out.print("Enter book year of writing: ");
        return Integer.parseInt(SCANNER.nextLine());
    }
}
