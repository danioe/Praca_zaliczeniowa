package org.example.bookstore;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca księgarnię, która przechowuje i zarządza książkami.
 */
public class Bookstore {
    private List<Book> books;

    public Bookstore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}