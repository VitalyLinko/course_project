package controller;

import bookservice.BookService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookParametersToChange {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void changeBookParameters() {
        try {
            BookService bookService = BookService.getBookService();
            int index;

            System.out.println("What you want to change:\n1-book name\n2-author\n3-year of writing\n4-genre\n5-return date");
            switch (UserChoiceInput.getUserChoiceInput()) {
                case 1:
                    bookService.showAllBooks();
                    System.out.print("Enter book ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new book name: ");
                    bookService.changeBookName(index, SCANNER.nextLine());
                    break;
                case 2:
                    bookService.showAllBooks();
                    System.out.print("Enter book ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new book author: ");
                    bookService.changeBookAuthor(index, SCANNER.nextLine());
                    break;
                case 3:
                    bookService.showAllBooks();
                    System.out.print("Enter book ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new date of writing: ");
                    bookService.changeBookYear(index, Integer.parseInt(SCANNER.nextLine()));
                    break;
                case 4:
                    bookService.showAllBooks();
                    System.out.print("Enter book ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new genre: ");
                    bookService.changeBookGenre(index, SCANNER.nextLine());
                    break;
                case 5:
                    bookService.showAllBooks();
                    System.out.print("Enter book ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.println("Enter new return date.");
                    System.out.print("Enter year: ");
                    int year = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter month: ");
                    int month = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter day: ");
                    int day = Integer.parseInt(SCANNER.nextLine());
                    bookService.changBookReturnDate(index, bookService.userDateCreator(year, month, day));
                    bookService.changBookAvailableStatus(index);
                    break;
                default:
                    System.out.println("No such option");

            }
        } catch (IndexOutOfBoundsException |
                 InputMismatchException exception) {
            System.out.println("Wrong input");
        }
    }
}