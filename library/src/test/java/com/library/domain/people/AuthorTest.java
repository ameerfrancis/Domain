package com.library.domain.people;

import com.library.factory.people.AuthorFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

  @Test
    public void getName() {

        Author a = AuthorFactory.getAuthor("John", "3456");
        Assert.assertEquals("John",a.getName());
    }

    @Test
    public void getAuthID() {

        Author a = AuthorFactory.getAuthor("John", "3456");
        Assert.assertEquals("3456",a.getAuthID());
    }
}