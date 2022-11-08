package datacrating;

import java.util.Scanner;

public class UserChoiceInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    static int userInput;

    public static int getUserChoiceInput() {
        while (true) {
            System.out.print("Your choice: ");
            try {
                return userInput = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input");
                continue;
            }
        }
    }
}
