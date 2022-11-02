package util;

import java.util.Scanner;

public class Menu {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void printMenu() {
        MenuOption[] menuOptions = MenuOption.values();
        for (MenuOption option : menuOptions) {
            if (option.equals(MenuOption.valueOf("DEFAULT"))){
                continue;
            }
                System.out.println(option);
        }
    }

    public static MenuOption retrieveUserChoice() {
        return MenuOption.convert(UserChoiceInput.getUserChoiceInput());
    }

}
