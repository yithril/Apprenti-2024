package org.example;

public class Author {
    private String name;
    private Book book; // One-to-one relationship

    public Author(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
