package com.library.repository;

import com.library.domain.people.Author;

import java.util.ArrayList;

public interface AuthorRepository extends CrudRepository<Author, String>{
    ArrayList<Author> getAll();

}
