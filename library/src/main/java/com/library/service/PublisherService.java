package com.library.service;


import com.library.domain.publisher.Publisher;

import java.util.ArrayList;
import java.util.Set;

public interface PublisherService extends CrudService<Publisher, String> {

    ArrayList<Publisher> getAllPublishers();
    ArrayList<Publisher> getAll();
}
