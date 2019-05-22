package com.library.service.impl.book;

import com.library.domain.book.Book;
import com.library.factory.book.BookFactory;
import com.library.repository.impl.Book.BookRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BookServiceImplTest {

    private BookRepositoryImpl repository;
    private Book book;


    private Book getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = BookRepositoryImpl.getRepository();
        this.book = BookFactory.getBook("12", "Thing", "Jack", "Drama", "dramabooks", "Peter");
    }

    @Test
    public void a_create() {
        Book created = this.repository.create(this.book);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.book);
    }

    @Test
    public void c_update() {
        String newBookTitle = "Ghost";
        Book updated = new Book.Builder().title(newBookTitle).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newBookTitle, updated.getTitle());
    }

    BookRepositoryImpl object = BookRepositoryImpl.getRepository();

    BookFactory bookFac = new BookFactory();

    Book test1 = bookFac.getBook("12", "Thing", "Jack", "Drama", "dramabooks", "Peter");
    Book test2 = bookFac.getBook("13", "Ghost", "Jack", "Horror", "horrorbooks", "Pete");


    @Test
    public void e_delete() {
        object.create(test1);
        this.repository.delete(test1.getTitle());
        d_getAll();
    }


    @Test
    public void b_read() {
        object.create(test2);
        Book read = object.read(test2.getId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, test2);
    }

    @Test
    public void d_getAll() {
        ArrayList<Book> books = this.repository.getAll();
        System.out.println("In getall, all = " + books);
    }
}