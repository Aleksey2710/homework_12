package com.skypro.homework_12;

import javax.security.sasl.AuthorizeCallback;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return startAge == book.startAge && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, startAge);
    }

    @Override
    public String toString() {
        return nameBook + ", " + author + ", " + startAge;
    }
}
