package busineslogic;

import datacrating.UserChoiceInput;
import usermodel.RegularUser;
import userrepository.UserRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserRepositoryLogic {

    private static final Scanner SCANNER = new Scanner(System.in);


    public static void addUser(RegularUser user) {
        UserRepository.getUsersList().add(user);
    }

    public static void deleteUser() {
        System.out.println("Enter user number.");
        try {
            UserRepository.getUsersList().remove(UserChoiceInput.getUserChoiceInput() - 1);
        } catch (IndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Wrong input");
        }
    }

    public static void changeUserParameters() {

        System.out.println("Enter user ID.");
        try {
            RegularUser userForChanging = UserRepository.getUsersList().get(UserChoiceInput.getUserChoiceInput() - 1);
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
        } catch (IndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Wrong input");
        }
    }

    public static void showUserRepository() {
        int count = 1;
        for (RegularUser user :
                UserRepository.getUsersList()) {
            System.out.println(count + ". " + user);
            count++;
        }
    }

    public static void searchingUserByFirstName() {
        System.out.print("Enter first name: ");
        String name = SCANNER.nextLine();
        UserRepository.getUsersList().stream().filter(user -> user.getFirstName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    public static void searchingUserByLastName() {
        System.out.print("Enter last name: ");
        String name = SCANNER.nextLine();
        UserRepository.getUsersList().stream().filter(user -> user.getFirstName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    public static void sortingUsersByFirstName() {
        UserRepository.getUsersList().stream()
                .sorted((user1, user2) -> (user1.getFirstName().toLowerCase().compareTo(user2.getFirstName().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void sortingUsersByFirstNameRevers() {
        UserRepository.getUsersList().stream()
                .sorted((user1, user2) -> (user2.getFirstName().toLowerCase().compareTo(user1.getFirstName().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void sortingUsersByLastName() {
        UserRepository.getUsersList().stream()
                .sorted((user1, user2) -> (user1.getLastName().toLowerCase().compareTo(user2.getLastName().toLowerCase())))
                .forEach(System.out::println);
    }

    public static void sortingUsersByLastNameRevers() {
        UserRepository.getUsersList().stream()
                .sorted((user1, user2) -> (user2.getLastName().toLowerCase().compareTo(user1.getLastName().toLowerCase())))
                .forEach(System.out::println);
    }
}
