package models;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String content;
    private double price;

    public Book(String title, String author, String content, double price) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
