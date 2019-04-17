package com.library.domain;

public class Book {

    private String title, author, genre, publisher, supplier;


    private Book(){}

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
        this.supplier = builder.supplier;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getSupplier() {
        return supplier;
    }


    public static class Builder {

        private String title, author, genre, publisher, supplier;


        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder supplier(String supplier) {
            this.supplier = supplier;
            return this;
        }


        public Book build() {
            return new Book(this);
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
