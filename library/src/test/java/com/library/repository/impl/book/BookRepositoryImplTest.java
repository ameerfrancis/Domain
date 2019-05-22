package com.library.repository.impl.book;

import com.library.domain.book.Book;
import com.library.factory.book.BookFactory;
import com.library.repository.impl.Book.BookRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookRepositoryImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    BookRepositoryImpl object = BookRepositoryImpl.getRepository();

    BookFactory bookFac = new BookFactory();

    Book test1 = bookFac.getBook("12", "Thing", "Jack", "Drama", "dramabooks", "Peter");
    Book test2 = bookFac.getBook("13", "Ghost", "Ashley", "Horror", "horrorbooks", "Darren");
    Book test3 = bookFac.getBook("13", "Love", "Ashley", "Horror", "horrorbooks", "Darren");


    @Test
    public void getRepository() {

        BookRepositoryImpl book = BookRepositoryImpl.getRepository();

        Assert.assertNotNull(book);
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

        Book book = object.read("13");

        Assert.assertEquals(test2, book);
    }

    @Test
    public void update() {

        object.create(test1);
        object.create(test2);

        Book book = object.update(test3);

        Assert.assertEquals(test3,book);
    }

    @Test
    public void delete() {

        object.create(test1);

        object.delete("12");

        Assert.assertEquals(0, object.getAll().size());
    }
}