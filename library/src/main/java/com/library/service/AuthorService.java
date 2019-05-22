package com.library.service;

import com.library.domain.people.Author;

import java.util.ArrayList;

public interface AuthorService extends CrudService<Author, String> {

    ArrayList<Author> getAllAuthors();
    ArrayList<Author> getAll();
}
