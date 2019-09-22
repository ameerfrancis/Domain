package com.library.controller.publisher;


import com.library.domain.people.Author;
import com.library.domain.publisher.Publisher;
import com.library.factory.people.AuthorFactory;
import com.library.factory.publisher.PublisherFactory;
import com.library.service.impl.people.AuthorServiceImpl;
import com.library.service.impl.publisher.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/library/publisher ")

public class PublisherController {

    @Autowired
    @Qualifier("PublisherServiceImpl")
    private PublisherServiceImpl service;

    @GetMapping("/create/{publisherName, publisherID}")
    public @ResponseBody
    Publisher create(@PathVariable String publisherName, String publisherID){
        Publisher publisher = PublisherFactory.getPublisher(publisherName, publisherID);
        return service.create(publisher);

    }

    @GetMapping("/getall")
    @ResponseBody
    public ArrayList<Publisher> getAll(){
        return service.getAll();
    }
}
