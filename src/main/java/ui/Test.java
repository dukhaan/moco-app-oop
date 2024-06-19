package ui;

import models.User;
import models.Admin;
import models.Book;
import models.Reader;
import services.DatabaseService;

public class Test {

    public static void main(String[] args) {
        
        //edited by ilham
        User admin = new Admin("Admin Name", "admin", "adminpassword");
        DatabaseService.addUser(admin);

        User reader = new Reader("Reader Name", "reader", "readerpassword");
        DatabaseService.addUser(reader);

        System.out.println("List of Users:");
        for (User user : DatabaseService.getAllUsers()) {
            System.out.println("Name: " + user.getName() + ", Username: "
                    + user.getUsername());
        }

        Book book1 = new Book("Title 1", "Author 1", "Content 1", 2);
        Book book2 = new Book("Title 2", "Author 2", "Content 2", 29.99);

        System.out.println("\nList of Books:");
        System.out.println("Book 1 - Title: " + book1.getTitle() + ", Author: " + book1.getAuthor());
        System.out.println("Book 2 - Title: " + book2.getTitle() + ", Author: " + book2.getAuthor());

        if (reader instanceof Reader) {
            Reader readerInstance1 = (Reader) reader;
            Reader readerInstance2 = (Reader) reader;
            System.out.println("\nReader's Balance Before Purchase: $" + readerInstance1.getBalance());

            readerInstance1.addBalance(10);
            if (book2.getPrice() > 0) {
                readerInstance1.deductBalance(book1.getPrice());
                System.out.println("\nReader's Balance After Purchase: $s" + readerInstance1.getBalance());
            } else {
                System.out.println("This book is free. No deduction from the balance.");
            }

            System.out.println("\nReader's Balance Before Purchase: $" + readerInstance2.getBalance());
        }
    }
}
