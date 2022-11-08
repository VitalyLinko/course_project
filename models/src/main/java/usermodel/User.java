package usermodel;

import bookmodel.PrintedProduct;

import java.util.List;

public abstract class User {

    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "firstName = " + firstName + '\n' +
                "lastName = " + lastName + '\n' +
                "age = " + age;
    }
}
