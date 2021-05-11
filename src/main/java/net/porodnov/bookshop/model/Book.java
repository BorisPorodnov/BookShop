package net.porodnov.bookshop.model;

import net.porodnov.bookshop.entity.BookEntity;
import net.porodnov.bookshop.entity.Genre;

public class Book {

    private Long id;
    private String Author;
    private String title;
    private double price;
    private Genre genre;

    public static Book toModel(BookEntity entity) {
        Book model = new Book();
        model.setId(entity.getId());
        model.setAuthor(entity.getAuthor());
        model.setTitle(entity.getTitle());
        model.setPrice(entity.getPrice());
        model.setGenre(entity.getGenre());
        return model;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
