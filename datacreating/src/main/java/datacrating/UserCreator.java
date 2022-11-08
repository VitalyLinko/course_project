package datacrating;

import usermodel.RegularUser;

import java.util.Scanner;

public class UserCreator {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static RegularUser userCreator() {
        RegularUser user = new RegularUser();
        user.setFirstName(getUserFirstName());
        user.setLastName(getUserLastName());
        user.setAge(getUserAge());
        return user;
    }

    private static int getUserAge() {
        System.out.print("Enter age: ");
        return Integer.parseInt(SCANNER.nextLine());
    }


    private static String getUserFirstName() {
        System.out.print("Enter first name: ");
        return SCANNER.nextLine();
    }

    private static String getUserLastName() {
        System.out.print("Enter last name: ");
        return SCANNER.nextLine();
    }
}
