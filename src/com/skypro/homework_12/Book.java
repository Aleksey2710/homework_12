package com.skypro.homework_12;

import javax.security.sasl.AuthorizeCallback;

public class Book {
    private String nameBook;
    private Author author;
    private int startAge;

    public Book(String nameBook, Author fullName, int startAge) {
        this.nameBook = nameBook;
        this.author = fullName;
        this.startAge = startAge;
    }

    public Book(Author author) {
        this.author = author;
    }


    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getStartAge() {
        return this.startAge;
    }

    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return nameBook.equals(c2.nameBook);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
    @Override
    public String toString() {
        return nameBook + ", " + author + ", " + startAge;
    }
}
