package com.library.factory.people;

import com.library.domain.people.Author;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthorFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAuthor() {

        Author a = AuthorFactory.getAuthor("Mary", "1234");
        Assert.assertEquals("Mary", a.getName());
    }
}