package com.library.domain.book;

import com.library.factory.book.BookFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    Book b = BookFactory.getBook("12", "Thing", "Jack", "drama", "yes", "Peter");

    @Test
    public void getId() {

        Assert.assertEquals("12", b.getId());
    }

    @Test
    public void getTitle() {

        Assert.assertEquals("Thing", b.getTitle());
    }

    @Test
    public void getAuthor() {

        Assert.assertEquals("Jack", b.getAuthor());
    }

    @Test
    public void getGenre() {

        Assert.assertEquals("drama", b.getGenre());
    }

    @Test
    public void getPublisher() {

        Assert.assertEquals("yes", b.getPublisher());
    }

    @Test
    public void getSupplier() {

        Assert.assertEquals("Peter", b.getSupplier());
    }
}