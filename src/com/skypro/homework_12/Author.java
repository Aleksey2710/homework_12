package com.skypro.homework_12;

import java.util.Objects;

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

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
