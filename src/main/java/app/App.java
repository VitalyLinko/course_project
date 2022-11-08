package app;

import productrepository.PrintedProductRepository;
import userrepository.UserRepository;
import util.BookCreator;
import util.Menu;
import util.MenuOption;
import util.UserCreator;

public class App {
    public static void main(String[] args) {

        boolean continueProgram = true;

        while (continueProgram) {
            Menu.printMenu();
            MenuOption userChoice = Menu.retrieveUserChoice();
            switch (userChoice) {
                case NEW_PRODUCT:
                    PrintedProductRepository.addBook(BookCreator.bookCreator());
                    break;
                case NEW_USER:
                    UserRepository.addUser(UserCreator.userCreator());
                    break;
                case SHOW_PRODUCT:
                    PrintedProductRepository.showBookRepository();
                    break;
                case SHOW_USER:
                    UserRepository.showUserRepository();
                    break;
                case CHANGE_USER_PARAMETERS:
                    UserRepository.changeUserParameters();
                    break;
                case CHANGE_BOOK_PARAMETERS:
                    PrintedProductRepository.changeBookParameters();
                    break;
                case SHOW_TAKEN_BOOKS:
                    PrintedProductRepository.showListOfTakenBooks();
                    break;
                case SHOW_AVAILABLE_BOOKS:
                    PrintedProductRepository.showListOfAvailableBooks();
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
