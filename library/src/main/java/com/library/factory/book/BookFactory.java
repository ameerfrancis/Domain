package com.library.factory.book;

import com.library.domain.book.Book;

public class BookFactory {

    public static Book getBook(String id, String title, String author, String genre, String publisher, String supplier) {
        return new Book.Builder().id(id).title(title)
                .author(author)
                .genre(genre)
                .publisher(publisher)
                .supplier(supplier)
                .build();
    }
}
