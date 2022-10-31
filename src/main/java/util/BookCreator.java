package util;

import bookmodel.Book;

import java.time.LocalDate;
import java.util.Scanner;

public class BookCreator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static Book bookCreator() {
        Book book = new Book();
        book.setProductName(getBookName());
        book.setBookAuthor(getBookAuthor());
        book.setBookGenre(getBookGenre());
        book.setYearOfWriting(getBookYearOfWriting());
        book.setProductReturnDate(getBookReturnDate());
        book.setAvailableStatus(getBookAvailableStatus());
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


    private static LocalDate getBookReturnDate() {
        return DateInput.userDateCreator();
    }

    private static boolean getBookAvailableStatus() {
        System.out.print("Is book taken:\n1-Yes\n2-No\n");
        if (Integer.parseInt(SCANNER.nextLine())==1){
            return true;
        }
        return false;
    }

}
