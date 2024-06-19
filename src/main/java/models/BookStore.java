package models;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void displayBooks() {
        System.out.println("List of Books in the Bookstore:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice());
        }
    }

    public Book purchaseBook(User user, int bookIndex) {
        if (bookIndex >= 0 && bookIndex < books.size()) {
            Book selectedBook = books.get(bookIndex);
            if (user instanceof Reader) {
                Reader reader = (Reader) user;
                if (reader.getBalance() >= selectedBook.getPrice()) {
                    reader.deductBalance(selectedBook.getPrice());
                    return selectedBook;
                } else {
                    System.out.println("Insufficient balance. Please top up your account.");
                }
            } else {
                System.out.println("Only readers can purchase books.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
        return null;
    }
}
