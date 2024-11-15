package org.example;

public class Library {
    private String address;
    private String name;
    private Book bookOfTheMonth;

    public Library(String address, String name, Book bookOfTheMonth) {
        this.address = address;
        this.name = name;
        this.bookOfTheMonth = bookOfTheMonth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBookOfTheMonth() {
        return bookOfTheMonth;
    }

    public void setBookOfTheMonth(Book bookOfTheMonth) {
        this.bookOfTheMonth = bookOfTheMonth;
    }
}
