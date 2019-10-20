package com.library.repository;

import com.library.domain.people.Author;
//import org.springframework.data.jpa.repository.JpaRepository;


import java.util.ArrayList;

public interface AuthorRepository extends CrudRepository<Author, String> {
    ArrayList<Author> getAll();

}
