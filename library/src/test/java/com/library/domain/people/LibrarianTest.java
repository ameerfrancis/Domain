package com.library.domain.people;

import com.library.factory.people.LibrarianFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibrarianTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    Librarian lib = LibrarianFactory.getLibrarian("Samantha", "1234", "Senior");

    @Test
    public void getName() {
        Assert.assertEquals("Samantha", lib.getName());
    }

    @Test
    public void getStaffNumber() {
        Assert.assertEquals("1234", lib.getStaffNumber());
    }

    @Test
    public void getStaffType() {
        Assert.assertEquals("Senior", lib.getStaffType());
    }
}