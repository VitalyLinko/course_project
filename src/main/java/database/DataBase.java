package database;


import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static DataBase USER_DATA_BASE;

    private DataBase() {
    }

    public static DataBase getUserDataBase() {
        if (USER_DATA_BASE == null) {
            USER_DATA_BASE = new DataBase();
        }
        return USER_DATA_BASE;
    }

    private static List<User> users = new ArrayList<>();

    private static List<Book> books = new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        DataBase.users = users;
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        DataBase.books = books;
    }
}
