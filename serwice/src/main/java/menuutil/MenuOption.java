package menuutil;

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
    DELETE_BOOK(9, "Delete book"),
    SEARCHING_BOOK_NAME(10, "Searching book by name"),
    SEARCHING_BOOK_AUTHOR(11, "Searching book by author"),
    SEARCHING_BOOK_GENRE(12, "Searching book by genre"),
    SORTING_BOOK_NAME(13, "Sorting books by name (natural order)"),
    SORTING_BOOK_NAME_REVERS(14, "Sorting books by name (revers order)"),
    SORTING_BOOK_AUTHOR(15, "Sorting books by author (natural order)"),
    SORTING_BOOK_AUTHOR_REVERS(16, "Sorting books by author (revers order)"),
    SHOW_OVERDUE_REFUNDS(17, "Show overdue refunds"),
    SHOW_BOOK_HISTORY(18, "Show book history"),
    DELETE_USER(19, "Delete user"),
    SEARCHING_USER_NAME(20, "Searching user by first name"),
    SEARCHING_USER_LAST_NAME(21, "Searching user by last name"),
    SORTING_USER_NAME(22, "Sorting users by first name (natural order)"),
    SORTING_USER_NAME_REVERS(23, "Sorting users by first name (revers order)"),
    SORTING_USER_LAST_NAME(24, "Sorting users by last name (natural order)"),
    SORTING_USER_LAST_NAME_REVERS(25, "Sorting users by last name (revers order)"),
    STOP(26, "Stop");

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
