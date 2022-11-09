package userservice;

public interface Service {
    void addUser(String name, String lastname, int age);

    void showAllUsers();

    void changeUserName(int index, String name);

    void changeUserLastName(int index, String lastName);

    void changeUserAge(int index, int age);


}
