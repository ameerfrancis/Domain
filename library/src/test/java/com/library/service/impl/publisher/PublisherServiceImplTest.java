package com.library.service.impl.publisher;

import com.library.domain.publisher.Publisher;
import com.library.factory.publisher.PublisherFactory;
import com.library.repository.impl.publisher.PublisherRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PublisherServiceImplTest {

    private PublisherRepositoryImpl repository;
    private Publisher publisher;


    private Publisher getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PublisherRepositoryImpl.getRepository();
        this.publisher = PublisherFactory.getPublisher("Amy", "912");
    }

    @Test
    public void a_create() {
        Publisher created = this.repository.create(this.publisher);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.publisher);
    }

    @Test
    public void c_update() {
        String newPublisherName = "John";
        Publisher updated = new Publisher.Builder().publisherName(newPublisherName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newPublisherName, updated.getPublisherName());
    }

    PublisherRepositoryImpl object = PublisherRepositoryImpl.getRepository();

    PublisherFactory pubFac = new PublisherFactory();

    Publisher test1 = pubFac.getPublisher("Ross", "78");
    Publisher test2 = pubFac.getPublisher("Ameer", "79");


    @Test
    public void e_delete() {
        object.create(test1);
        this.repository.delete(test1.getPublisherName());
        d_getAll();
    }


    @Test
    public void b_read() {
        object.create(test2);
        Publisher read = object.read(test2.getPublisherID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, test2);
    }

    @Test
    public void d_getAll() {
        ArrayList<Publisher> publishers = this.repository.getAll();
        System.out.println("In getall, all = " + publishers);
    }
}