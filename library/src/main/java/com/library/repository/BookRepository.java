package com.library.repository;

import com.library.domain.book.Book;

import java.util.ArrayList;
import java.util.Set;

public interface BookRepository extends CrudRepository<Book, String> {
    ArrayList<Book> getAll();
}
