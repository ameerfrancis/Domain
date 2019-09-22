package com.library.repository.impl.Book;

import java.util.ArrayList;

import com.library.domain.book.Book;
import org.springframework.stereotype.Repository;

@Repository("BookRepo")
public class BookRepositoryImpl {

    private static BookRepositoryImpl repository = null;
    private ArrayList<Book> books;

    private BookRepositoryImpl() {
        this.books = new ArrayList<Book>();
    }

    public static BookRepositoryImpl getRepository() {
        if (repository == null) repository = new BookRepositoryImpl();
        return repository;
    }


    public Book create(Book book) {
        this.books.add(book);
        return book;
    }

    public Book read(String id) {
        Book book = null;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equalsIgnoreCase(id)) {
                book = books.get(i);
            }
        }

        // find the course that matches the id and return it if exist
        return book;
    }

    public Book update(Book book) {
        Book bk = null;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equalsIgnoreCase(book.getId())) {
                books.set(i, book);
                bk = books.get(i);
            }
        }
        // find the course, update it and delete it if it exists
        return bk;
    }

    public void delete(String id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equalsIgnoreCase(id)) {
                books.remove(i);
            }
        }
    }


    public ArrayList<Book> getAll() {
        return books;
    }
}
