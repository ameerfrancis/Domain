package com.library.service.impl.people;

import com.library.domain.people.Author;
import com.library.repository.AuthorRepository;
import com.library.service.AuthorService;

import java.util.ArrayList;

public class AuthorServiceImpl implements AuthorService {

    private AuthorServiceImpl service = null;
    private AuthorRepository repository;

    /*private AuthorServiceImpl(){
        this.repository = AuthorServiceImpl.getRepository();
    }*/

    public AuthorService getService(){
        if (service == null) service = new AuthorServiceImpl();
        return service;
    }


    @Override
    public Author create(Author author) {
        return this.repository.create(author);
    }

    @Override
    public Author update(Author author) {
        return this.repository.update(author);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Author read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArrayList<Author> getAllAuthors() {
        ArrayList<Author> authors = getAll();

        return null;
    }

    @Override
    public ArrayList<Author> getAll() {
        return this.repository.getAll();
    }

}
