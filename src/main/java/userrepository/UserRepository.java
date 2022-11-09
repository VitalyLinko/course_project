package userrepository;

import database.DataBase;
import model.Book;
import model.User;

import java.util.List;

public class UserRepository implements Repository{

    private static UserRepository daoUserRepository;

    private UserRepository() {
    }

    public static UserRepository getDaoUserRepository() {
        if (daoUserRepository == null) {
            daoUserRepository = new UserRepository();
        }
        return daoUserRepository;
    }
    public User getNewUser(User user) {
        return user;
    }

    public List<User> getListOfUsers() {
        return DataBase.getUsers();
    }

    public List<Book> getListOfBooks() {
        return DataBase.getBooks();
    }


}
