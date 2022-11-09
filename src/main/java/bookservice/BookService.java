package bookservice;

import bookrepository.BookRepository;
import model.Book;

import java.time.DateTimeException;
import java.time.LocalDate;

public class BookService implements Service {
    private static BookService boolService;

    private BookService() {
    }

    public static BookService getBookService() {
        if (boolService == null) {
            boolService = new BookService();
        }
        return boolService;
    }

    @Override
    public void addBook(String name, String author, int year, String genre) {
        BookRepository.getBookRepository().getListOfBooks().add(BookRepository.getBookRepository().getNewBook(new Book(name, author, year, genre)));
    }

    @Override
    public void showAllBooks() {
        BookRepository.getBookRepository().getListOfBooks().stream()
                .forEach(System.out::println);
    }

    @Override
    public void changeBookName(int index, String name) {
        BookRepository.getBookRepository().getListOfBooks().get(index - 1).setName(name);

    }

    @Override
    public void changeBookAuthor(int index, String author) {
        BookRepository.getBookRepository().getListOfBooks().get(index - 1).setAuthor(author);
    }

    @Override
    public void changeBookYear(int index, int year) {
        BookRepository.getBookRepository().getListOfBooks().get(index - 1).setYearOfWriting(year);
    }

    @Override
    public void changeBookGenre(int index, String genre) {
        BookRepository.getBookRepository().getListOfBooks().get(index - 1).setGenre(genre);
    }

    @Override
    public void changBookReturnDate(int index, LocalDate localDate) {
        BookRepository.getBookRepository().getListOfBooks().get(index - 1).setReturnDate(localDate);
    }

    @Override
    public void changBookAvailableStatus(int index) {
        if (!BookRepository.getBookRepository().getListOfBooks().get(index).getAvailableStatus()) {
            BookRepository.getBookRepository().getListOfBooks().get(index - 1).setAvailableStatus(true);
        } else {
            BookRepository.getBookRepository().getListOfBooks().get(index - 1).setAvailableStatus(false);
        }
    }

    @Override
    public void showListOfTakenBooks() {
        BookRepository.getBookRepository().getListOfBooks().stream()
                .filter(book -> book.getAvailableStatus() == true)
                .forEach(System.out::println);
    }

    @Override
    public void showListOfAvailableBooks() {
        BookRepository.getBookRepository().getListOfBooks().stream()
                .filter(book -> book.getAvailableStatus() == false)
                .forEach(System.out::println);

    }

    public LocalDate userDateCreator(int year, int month, int day) {
        while (true) {
            try {
                LocalDate dateOfReturn = LocalDate.of(year, month, day);
                LocalDate localDateToday = LocalDate.now();
                if (dateOfReturn.isAfter(localDateToday)) {
                    return dateOfReturn;
                } else {
                    System.out.println("Invalid input. Your data is before current date.");
                    return null;
                }
            } catch (DateTimeException e) {
                System.out.println("Invalid input.");
                return null;
            }
        }
    }
}
