package userrepository;

import usermodel.RegularUser;

import java.util.LinkedList;
import java.util.List;

public class UserRepository {

    private static List<RegularUser> usersList = new LinkedList<>();

    public static List<RegularUser> getUsersList() {
        return usersList;
    }

    public static void setUsersList(List<RegularUser> usersList) {
        UserRepository.usersList = usersList;
    }
}
