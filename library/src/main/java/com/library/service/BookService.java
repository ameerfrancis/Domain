package com.library.service;

import com.library.domain.book.Book;

import java.util.ArrayList;
import java.util.Set;

public interface BookService extends CrudService<Book, String> {

    ArrayList<Book> getAllBookIDs();
    ArrayList<Book> getAll();
}
