package com.library.controller.people;
import com.library.domain.people.Author;
import com.library.factory.people.AuthorFactory;
import com.library.service.impl.people.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/library/author ")
public class AuthorController {

    @Autowired
    @Qualifier("AuthorServiceImpl")
    private AuthorServiceImpl service;

    @GetMapping("/create/{authorName, authorID}")
    public @ResponseBody
    Author create(@PathVariable String authorName, String authorID){
        Author author = AuthorFactory.getAuthor(authorName, authorID);
        return service.create(author);

    }

    @GetMapping("/getall")
    @ResponseBody
    public ArrayList<Author> getAll(){
        return service.getAll();
    }
}
