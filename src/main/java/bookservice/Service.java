package bookservice;

import java.time.LocalDate;

public interface Service {

    void addBook(String name, String author, int year, String genre);

    void showAllBooks();

    void changeBookName(int index, String name);

    void changeBookAuthor(int index, String author);

    void changeBookYear(int index, int year);

    void changeBookGenre(int index, String genre);

    void changBookReturnDate(int index, LocalDate localDate);

    void changBookAvailableStatus(int index);

    void showListOfTakenBooks();

    void showListOfAvailableBooks();

    LocalDate userDateCreator(int year, int month, int day);
}
