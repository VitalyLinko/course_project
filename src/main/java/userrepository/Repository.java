package userrepository;

import model.User;

import java.util.List;

public interface Repository {

    User getNewUser(User user);

    List<User> getListOfUsers();
}
