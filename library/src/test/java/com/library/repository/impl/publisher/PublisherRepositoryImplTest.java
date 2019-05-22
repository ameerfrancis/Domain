package com.library.repository.impl.publisher;

import com.library.domain.publisher.Publisher;
import com.library.factory.publisher.PublisherFactory;
import com.library.repository.impl.publisher.PublisherRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;

public class PublisherRepositoryImplTest {

   // @Before
   // public void setUp() throws Exception {
   // }

    //@After
    //public void tearDown() throws Exception {
    //}

    PublisherRepositoryImpl object = PublisherRepositoryImpl.getRepository();

    PublisherFactory pubFact = new PublisherFactory();

    Publisher test1 = pubFact.getPublisher("Joey", "01");
    Publisher test2 = pubFact.getPublisher("Ross", "02");
    Publisher test3 = pubFact.getPublisher("Chandler", "01");

    @Test
    public void getRepository() {

        PublisherRepositoryImpl publisher = PublisherRepositoryImpl.getRepository();


        Assert.assertNotNull(publisher);
    }

    @Test
    public void create() {

        object.create(test1);

        int num = object.getAll().size();

        Assert.assertEquals(1, num);
    }

    @Test
    public void read() {

        object.create(test1);
        object.create(test2);

        Publisher pub = object.read("01");

        Assert.assertEquals(test1, pub);
    }

    @Test
    public void update() {

        object.create(test1);
        object.create(test2);

        Publisher pub = object.update(test3);

        Assert.assertEquals(test3,pub);
    }

    @Test
    public void delete() {

        object.create(test1);

        object.delete("01");

        Assert.assertEquals(0, object.getAll().size());
    }
}