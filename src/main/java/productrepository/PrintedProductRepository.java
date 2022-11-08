package productrepository;

import bookmodel.Book;
import util.DateInput;
import util.UserChoiceInput;

import java.util.*;

public class PrintedProductRepository {

    private static final Scanner SCANNER = new Scanner(System.in);

    static List<Book> booksList = new LinkedList<>();

    public static void addBook(Book book) {
        booksList.add(book);
    }

    public static void changeBookParameters() {
        System.out.println("Enter book number.");
        try {
            Book bookForChanging = booksList.get(UserChoiceInput.getUserChoiceInput() - 1);
            System.out.println("What you want to change:\n1-book name\n2-author\n3-year of writing\n4-genre\n5-return date\n6-book is taken");
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
                    System.out.print("Enter new return date: ");
                    bookForChanging.setProductReturnDate(DateInput.userDateCreator());
                    break;
                case 6:
                    if (bookForChanging.getAvailableStatus() == true) {
                        bookForChanging.setAvailableStatus(false);
                    } else {
                        bookForChanging.setAvailableStatus(true);
                    }
                    System.out.println("Parameter was changed to - " + bookForChanging.getAvailableStatus());
                    break;
                default:
                    System.out.println("No such option");

            }
        } catch (IndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Wrong input");
        }

    }

    public static void showBookRepository() {
        for (Book book :
                booksList) {
            System.out.println(book);
        }
    }

    public static void showListOfTakenBooks() {
        booksList.stream().filter(book -> book.getAvailableStatus()==true)
                .forEach(book -> System.out.println(book.getProductName() + " - " + book.getProductReturnDate()));
    }

    public static void showListOfAvailableBooks(){
        booksList.stream().filter(book -> book.getAvailableStatus()==false)
                .forEach(System.out::println);
    }
}
