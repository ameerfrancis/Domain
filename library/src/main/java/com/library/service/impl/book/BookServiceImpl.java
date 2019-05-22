package com.library.service.impl.book;

import com.library.domain.book.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;

import java.util.ArrayList;

public class BookServiceImpl implements BookService {

    private BookServiceImpl service = null;
    private BookRepository repository;

    /*private AuthorServiceImpl(){
        this.repository = AuthorServiceImpl.getRepository();
    }*/

    public BookService getService(){
        if (service == null) service = new BookServiceImpl();
        return service;
    }


    @Override
    public Book create(Book book) {
        return this.repository.create(book);
    }

    @Override
    public Book update(Book book) {
        return this.repository.update(book);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Book read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArrayList<Book> getAllBookIDs() {
        ArrayList<Book> books = getAll();

        return null;
    }

    @Override
    public ArrayList<Book> getAll() {
        return this.repository.getAll();
    }


}
