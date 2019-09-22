package com.library.repository.impl.publisher;

import java.util.ArrayList;

import com.library.domain.publisher.Publisher;
import org.springframework.stereotype.Repository;

@Repository("PublisherRepositoryImpl")

public class PublisherRepositoryImpl {

    private static PublisherRepositoryImpl repository = null;
    private ArrayList<Publisher> publishers;

    private PublisherRepositoryImpl(){
        this.publishers = new ArrayList<Publisher>();
    }

    public static PublisherRepositoryImpl getRepository(){
        if (repository == null) repository = new PublisherRepositoryImpl();
        return repository;
    }


    public Publisher create(Publisher publisher){
        this.publishers.add(publisher);
        return publisher;
    }

    public Publisher read(String publisherID){
        Publisher pub = null;

        for(int i = 0; i < publishers.size(); i++)
        {
            if(publishers.get(i).getPublisherID().equalsIgnoreCase(publisherID))
            {
                pub = publishers.get(i);
            }
        }

        // find the course that matches the id and return it if exist
        return pub;
    }

    public Publisher update(Publisher publisher){
        Publisher pub  = null;

        for(int i = 0; i < publishers.size();i++)
        {
            if(publishers.get(i).getPublisherID().equalsIgnoreCase(publisher.getPublisherID()))
            {
                publishers.set(i,publisher);
                pub = publishers.get(i);
            }
        }
        // find the course, update it and delete it if it exists
        return pub;
    }

    public void delete(String publisherID) {
        // find the course, delete it if it exist
        for(int i = 0; i < publishers.size(); i++)
        {
            if(publishers.get(i).getPublisherID().equalsIgnoreCase(publisherID))
            {
                publishers.remove(i);
            }
        }
    }


    public ArrayList<Publisher> getAll() {
        return publishers;
    }

    /*public Set<Author> getAll(Author author){
        return this.author;
    }*/
}
