package userservice;

import model.User;
import userrepository.UserRepository;


public class UserService implements Service {

    private static int counter = 0;

    private static UserService USER_SERVICE;

    private UserService() {
    }

    public static UserService getUserService() {
        if (USER_SERVICE == null) {
            USER_SERVICE = new UserService();
        }
        return USER_SERVICE;
    }

    UserRepository userRepository = UserRepository.getDaoUserRepository();

    @Override
    public void addUser(String name, String lastname, int age) {
        userRepository.getListOfUsers().add(new User(name, lastname, age));
    }

    @Override
    public void showAllUsers() {
        userRepository.getListOfUsers().forEach(System.out::println);
    }

    @Override
    public void changeUserLastName(int index, String lastName) {
        userRepository.getListOfUsers().get(index-1).setFirstName(lastName);
    }

    @Override
    public void changeUserAge(int index, int age) {
        userRepository.getListOfUsers().get(index-1).setAge(age);
    }

    public void changeUserName(int index, String name) {
        userRepository.getListOfUsers().get(index-1).setFirstName(name);
    }

//    public void sortByName() {
//        userRepository.getListOfBooks().stream()
//                .sorted((name1, name2) -> name1.getFirstName().compareTo(name2.getFirstName()))
//                .forEach(System.out::println);
//
//    }


}
