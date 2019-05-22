package com.library.factory.book;

import com.library.domain.book.Book;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    Book b = BookFactory.getBook("12", "Thing", "Jack", "drama", "yes", "Peter");


    @Test
    public void getBook() {

        Assert.assertEquals("12", b.getId());
    }
}