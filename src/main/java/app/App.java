package app;

import bookservice.BookService;
import controller.BookParametersToChange;
import controller.Menu;
import controller.MenuOption;
import controller.UserParametersToChange;
import userservice.UserService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        boolean continueProgram = true;

        Scanner scanner = new Scanner(System.in);

        while (continueProgram) {
            Menu.printMenu();
            MenuOption userChoice = Menu.retrieveUserChoice();
            switch (userChoice) {
                case NEW_PRODUCT:
                    System.out.print("Enter book name:");
                    String name = scanner.nextLine();
                    System.out.print("Enter author:");
                    String author = scanner.nextLine();
                    System.out.print("Enter year of writing:");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter genre:");
                    String genre = scanner.nextLine();
                    BookService.getBookService().addBook(name,author,year,genre);
                    break;
                case NEW_USER:
                    System.out.print("Enter name:");
                    name = scanner.nextLine();
                    System.out.print("Enter lastname:");
                    String lastname = scanner.nextLine();
                    System.out.print("Enter age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    UserService.getUserService().addUser(name,lastname,age);
                    break;
                case SHOW_PRODUCT:
                    BookService.getBookService().showAllBooks();
                    break;
                case SHOW_USER:
                    UserService.getUserService().showAllUsers();
                    break;
                case CHANGE_BOOK_PARAMETERS:
                    BookParametersToChange.changeBookParameters();
                    break;
                case CHANGE_USER_PARAMETERS:
                    UserParametersToChange.changeUserParameters();
                    break;
                case SHOW_TAKEN_BOOKS:
                   BookService.getBookService().showListOfTakenBooks();
                    break;
                case SHOW_AVAILABLE_BOOKS:
                    BookService.getBookService().showListOfAvailableBooks();
                    break;
                case STOP:
                    continueProgram = false;
                    break;
                case DEFAULT:
                    System.out.println("No such option");
            }
        }
    }
}
