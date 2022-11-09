package controller;

import userservice.UserService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserParametersToChange {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void changeUserParameters() {
        try {
            System.out.println("What you want to change:\n1-first name\n2-last name\n3-age");
            switch (UserChoiceInput.getUserChoiceInput()) {
                case 1:
                    UserService.getUserService().showAllUsers();
                    System.out.print("Enter user ID: ");
                    int index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new first name: ");
                    UserService.getUserService().changeUserName(index, SCANNER.nextLine());
                    break;
                case 2:
                    UserService.getUserService().showAllUsers();
                    System.out.print("Enter user ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new first last name: ");
                    UserService.getUserService().changeUserLastName(index, SCANNER.nextLine());
                    break;
                case 3:
                    UserService.getUserService().showAllUsers();
                    System.out.print("Enter user ID: ");
                    index = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Enter new age: ");
                    UserService.getUserService().changeUserAge(index, Integer.parseInt(SCANNER.nextLine()));
                    break;
                default:
                    System.out.println("No such option");

            }
        } catch (IndexOutOfBoundsException | InputMismatchException exception){
            System.out.println("Wrong input");
        }
    }
}
