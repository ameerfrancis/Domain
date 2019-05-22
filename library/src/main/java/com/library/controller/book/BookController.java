package com.library.controller.book;

import com.library.domain.book.Book;
import com.library.domain.people.Author;
import com.library.factory.book.BookFactory;
import com.library.factory.people.AuthorFactory;
import com.library.service.impl.book.BookServiceImpl;
import com.library.service.impl.people.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/library/book ")
public class BookController {

    @Autowired
    private BookServiceImpl service;

    @GetMapping("/create/{bookID, title, author, genre, publisher, supplier}")
    public @ResponseBody
    Book create(@PathVariable String bookID, String title, String author, String genre, String publisher, String supplier){
        Book book = BookFactory.getBook(bookID, title, author, genre, publisher, supplier);
        return service.create(book);

    }

    @GetMapping("/getall")
    @ResponseBody
    public ArrayList<Book> getAll(){
        return service.getAll();
    }
}
