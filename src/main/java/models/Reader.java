package models;

import java.util.ArrayList;
import java.util.List;

public class Reader extends User {

    private double balance;
    private List<Book> library;
    private List<Book> wishlist;

    public Reader(String name, String username, String password) {
        super(name, username, password);
        this.balance = 10.0;
        this.library = new ArrayList<>();
        this.wishlist = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Balance added successfully. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Amount deducted successfully. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
    
    public void addBookToLibrary(Book book){
        if (!isBookInLibrary(book)) {
            library.add(book);
            System.out.println("Book added to the library.");
        } else {
            System.out.println("Book is already in the library. Not added.");
        }            
    }
    
    public boolean isBookInLibrary(Book book) {
        for (Book existingBook : library) {
            if (existingBook.equals(book)) {
                return true;
            }
        }
        return false;
    }
    
    public List<Book> getLibrary(){
        return library;
    }
    
    public void addBookToWishlist(Book book){
        if (!isBookInLibrary(book)) {
            wishlist.add(book);
            System.out.println("Book added to your wishlist.");
        } else {
            System.out.println("Book is already in your wishlist. Not added.");
        }            
    }
    
    public void removeFromWishlist(Book book){
        wishlist.remove(book);
    }
    
    public boolean isBookInWishlist(Book book) {
        for (Book existingBook : wishlist) {
            if (existingBook.equals(book)) {
                return true;
            }
        }
        return false;
    }
    
    public List<Book> getWishlist(){
        return wishlist;
    }
}
