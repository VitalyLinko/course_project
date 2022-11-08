package busineslogic;

import bookmodel.Book;
import datacrating.DateInput;
import datacrating.UserChoiceInput;
import bookmodel.HistoryToken;
import productrepository.PrintedProductRepository;
import usermodel.User;
import userrepository.UserRepository;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintedProductRepositoryLogic {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void addBook(Book book) {
        PrintedProductRepository.getBooksList().add(book);
    }

    public static void deleteBook() {
        System.out.println("Enter book number.");
        try {
            PrintedProductRepository.getBooksList().remove(UserChoiceInput.getUserChoiceInput() - 1);
        } catch (IndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Wrong input");
        }
    }

    public static void changeBookParameters() {
        int count = 1;
        for (Book book :
                PrintedProductRepository.getBooksList()) {
            System.out.println(count + " - " + book);
            count++;
        }
        System.out.println("Enter book number: ");
        try {

            Book bookForChanging = PrintedProductRepository.getBooksList().get(UserChoiceInput.getUserChoiceInput() - 1);
            System.out.println("What you want to change:\n1-book name\n2-author\n3-year of writing\n4-genre\n" + "5-taken/return date\n6-actual return date");
            switch (UserChoiceInput.getUserChoiceInput()) {
                case 1:
                    System.out.print("Enter new book name: ");
                    bookForChanging.setProductName(SCANNER.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new author: ");
                    bookForChanging.setBookAuthor(SCANNER.nextLine());
                    break;
                case 3:
                    System.out.print("Enter new date of writing: ");
                    bookForChanging.setYearOfWriting(SCANNER.nextInt());
                    break;
                case 4:
                    System.out.print("Enter new genre: ");
                    bookForChanging.setBookGenre(SCANNER.nextLine());
                    break;
                case 5:
                    System.out.print("Enter book taken date: ");
                    bookForChanging.setProductTakenDate(DateInput.userDateCreator());
                    System.out.print("Enter book return date: ");
                    bookForChanging.setProductReturnDate(DateInput.userDateCreator());
                    System.out.println("Enter book user.");
                    int counter = 1;
                    for (User user :
                            UserRepository.getUsersList()) {
                        System.out.println(counter + " - " + user);
                        counter++;
                    }
                    bookForChanging.setProductUserStatus(UserRepository.getUsersList().get(UserChoiceInput.getUserChoiceInput() - 1));
                    bookForChanging.setAvailableStatus(true);
                    break;
                case 6:
                    System.out.print("Enter book date of actual return: ");
                    bookForChanging.setProductReturnedDate(DateInput.userDateCreator());
                    bookForChanging.setAvailableStatus(false);
                    if (bookForChanging.getProductReturnedDate().isAfter(bookForChanging.getProductReturnDate())) {
                        System.out.println("The book was overdue!!!");
                    }
                    HistoryToken historyToken = new HistoryToken(bookForChanging.getProductTakenDate(), bookForChanging.getProductReturnedDate(), bookForChanging.getProductUserStatus());
                    bookForChanging.getBookHistory().add(historyToken);
                    bookForChanging.setProductReturnDate(null);
                    break;
                default:
                    System.out.println("No such option");

            }
        } catch (IndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Wrong input");
        }

    }

    public static void showBookRepository() {
        int count = 1;
        for (Book book :
                PrintedProductRepository.getBooksList()) {
            System.out.println(count + ". " + book);
            count++;
        }
    }

    public static void showListOfTakenBooks() {
        PrintedProductRepository.getBooksList().stream().filter(book -> book.getAvailableStatus() == true)
                .forEach(book -> System.out.println(book.getProductName() + " - " + book.getProductTakenDate()));
    }

    public static void showListOfAvailableBooks() {
        PrintedProductRepository.getBooksList().stream().filter(book -> book.getAvailableStatus() == false)
                .forEach(System.out::println);
    }

    public static void searchingBooksByName() {
        System.out.print("Enter book name: ");
        String bookName = SCANNER.nextLine();
        PrintedProductRepository.getBooksList().stream()
                .filter(book -> book.getProductName().equalsIgnoreCase(bookName))
                .forEach(System.out::println);
    }

    public static void searchingBooksByAuthor() {
        System.out.print("Enter book name author: ");
        String bookAuthor = SCANNER.nextLine();
        PrintedProductRepository.getBooksList().stream()
                .filter(book -> book.getBookAuthor().equalsIgnoreCase(bookAuthor))
                .forEach(System.out::println);
    }

    public static void searchingBookByGenre() {
        System.out.print("Enter book genre: ");
        String bookGenre = SCANNER.nextLine();
        PrintedProductRepository.getBooksList().stream()
                .filter(book -> book.getBookGenre().equalsIgnoreCase(bookGenre))
                .forEach(System.out::println);
    }

    public static void sortingBooksByName() {
        PrintedProductRepository.getBooksList().stream()
                .sorted((book1, book2) -> (book1.getProductName().toLowerCase().compareTo(book2.getProductName().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void sortingBooksByNameRevers() {
        PrintedProductRepository.getBooksList().stream()
                .sorted((book1, book2) -> (book2.getProductName().toLowerCase().compareTo(book1.getProductName().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void sortingBooksByAuthor() {
        PrintedProductRepository.getBooksList().stream()
                .sorted((book1, book2) -> (book1.getBookAuthor().toLowerCase().compareTo(book2.getBookAuthor().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void sortingBooksByAuthorRevers() {
        PrintedProductRepository.getBooksList().stream()
                .sorted((book1, book2) -> (book2.getBookAuthor().toLowerCase().compareTo(book1.getBookAuthor().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void showOverdueRefund() {
        PrintedProductRepository.getBooksList().stream()
                .filter(book -> book.getAvailableStatus())
                .filter(book -> book.getProductReturnDate().isBefore(LocalDate.now()))
                .forEach(System.out::println);
    }

    public static void showBookHistory() {
        int count = 1;
        for (Book book :
                PrintedProductRepository.getBooksList()) {
            System.out.println(count + " - " + book);
            count++;
        }
        System.out.println("Enter book number: ");
        try {
            Book bookForChanging = PrintedProductRepository.getBooksList().get(UserChoiceInput.getUserChoiceInput() - 1);
            System.out.println(bookForChanging.getProductName() + bookForChanging.getBookHistory());
        } catch (IndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Wrong input");
        }
    }
}
