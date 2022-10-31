package userrepository;

import usermodel.RegularUser;
import util.UserChoiceInput;

import java.util.*;

public class UserRepository {

    private static final Scanner SCANNER = new Scanner(System.in);

    static List<RegularUser> usersList = new LinkedList<>();

    public static void addUser(RegularUser user) {
        usersList.add(user);
    }

    public static void changeUserParameters() {

        System.out.println("Enter user ID.");
        try {
            RegularUser userForChanging = usersList.get(UserChoiceInput.getUserChoiceInput() - 1);
            System.out.println("What you want to change:\n 1-first name\n2-last name\n3-age");
            switch (UserChoiceInput.getUserChoiceInput()) {
                case 1:
                    System.out.print("Enter new first name: ");
                    userForChanging.setFirstName(SCANNER.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new last name: ");
                    userForChanging.setLastName(SCANNER.nextLine());
                    break;
                case 3:
                    System.out.print("Enter new age: ");
                    userForChanging.setAge(SCANNER.nextInt());
                    break;
                default:
                    System.out.println("No such option");

            }
        } catch (IndexOutOfBoundsException | InputMismatchException exception){
            System.out.println("Wrong input");
        }
    }

    public static void showUserRepository() {
        for (RegularUser user :
                usersList) {
            System.out.println(user);
        }
    }
}
