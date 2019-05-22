package com.library.repository;

import com.library.domain.publisher.Publisher;

import java.util.ArrayList;
import java.util.Set;

public interface PublisherRepository extends CrudRepository<Publisher, String> {
    ArrayList<Publisher> getAll();
}
