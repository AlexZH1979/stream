package ru.yandex.zhmyd;

import java.io.Serializable;

public class User extends People implements Serializable{

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;

    private int age;

    private TV tv;
    transient private String password;

    public User(String firstName, String lastName, String password) {
        tv = new TV();
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", tv=" + tv +
                ", password='" + password + '\'' +
                '}';
    }
}
