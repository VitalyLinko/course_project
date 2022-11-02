package util;

import java.util.Arrays;
import java.util.Optional;

public enum MenuOption {
    DEFAULT(0, "Default"),
    NEW_PRODUCT(1, "New Book"),
    NEW_USER(2, "New RegularUser"),
    SHOW_PRODUCT(3, "Show Books"),
    SHOW_USER(4, "Show Users"),
    CHANGE_BOOK_PARAMETERS(5, "Change book parameters"),
    CHANGE_USER_PARAMETERS(6, "Change user parameters"),
    SHOW_TAKEN_BOOKS(7, "Show taken books"),
    SHOW_AVAILABLE_BOOKS(8, "Show available books"),
    STOP(9, "Stop");

    private int value;
    private String menuOptionName;

    MenuOption(int value, String menuOptionName) {
        this.value = value;
        this.menuOptionName = menuOptionName;
    }

    public static MenuOption convert(int neededValue) {
        Optional<MenuOption> option = Arrays.stream(values())
                .filter(menuOption -> menuOption.value == neededValue)
                .findFirst();
        return option.orElse(MenuOption.DEFAULT);
    }

    @Override
    public String toString() {
        return value + " - " + menuOptionName;
    }
}
