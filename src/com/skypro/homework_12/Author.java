package com.skypro.homework_12;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void setFirstName(String firstName) {
        if (firstName.isBlank()) {
            System.out.println("No name");
            return;
        }else {
            this.firstName = firstName;
        }
    }
    public void setLastName(String lastName) {
        if (lastName.isBlank()) {
            System.out.println("No name");
            return;
        }else {
            this.lastName = lastName;
        }
    }
}
