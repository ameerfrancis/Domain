package com.library.service.impl.book;

import com.library.domain.book.Book;
import com.library.repository.BookRepository;
import com.library.repository.impl.Book.BookRepositoryImpl;
import com.library.service.BookService;
import com.library.service.impl.people.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("BookServiceImpl")

public class BookServiceImpl implements BookService {


@Qualifier("BookRepo")
    private BookServiceImpl service = null;
    private BookRepository repository;

//    private BookServiceImpl(){
//        this.repository = BookRepositoryImpl.getRepository();
//    }

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
