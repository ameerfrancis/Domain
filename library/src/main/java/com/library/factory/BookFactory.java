package com.library.factory;

import com.library.domain.Book;
import com.library.domain.Librarian;

public class BookFactory {

    public static Book getBook(String title, String author, String genre, String publisher, String supplier) {
        return new Book.Builder().title(title)
                .author(author)
                .genre(genre)
                .publisher(publisher)
                .supplier(supplier)
                .build();
    }
}
