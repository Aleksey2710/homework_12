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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return lastName.equals(c2.lastName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
