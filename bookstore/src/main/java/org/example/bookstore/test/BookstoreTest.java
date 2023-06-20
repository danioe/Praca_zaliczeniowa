package org.example.bookstore.test;

import com.example.bookstore.Book;
import com.example.bookstore.Bookstore;
import com.example.bookstore.util.Logger;

import java.util.List;

/**
 * Klasa testująca funkcjonalność klas z pakietu com.example.bookstore.
 */
public class BookstoreTest {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Python Basics", "Jane Doe");

        bookstore.addBook(book1);
        bookstore.addBook(book2);

        List<Book> allBooks = bookstore.getAllBooks();
        for (Book book : allBooks) {
            Logger.logInfo("Book: " + book.getTitle() + " by " + book.getAuthor());
        }

        bookstore.removeBook(book1);

        Logger.logInfo("After removing a book:");
        allBooks = bookstore.getAllBooks();
        for (Book book : allBooks) {
            Logger.logInfo("Book: " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}