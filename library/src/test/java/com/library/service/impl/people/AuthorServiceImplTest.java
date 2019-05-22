package com.library.service.impl.people;

import com.library.domain.people.Author;
import com.library.factory.people.AuthorFactory;
import com.library.repository.impl.AuthorRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AuthorServiceImplTest {

    private AuthorRepositoryImpl repository;
    private Author author;


    private Author getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AuthorRepositoryImpl.getRepository();
        this.author = AuthorFactory.getAuthor("Ameer", "987");
    }

    @Test
    public void a_create() {
        Author created = this.repository.create(this.author);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.author);
    }

    @Test
    public void c_update() {
        String newAuthorName = "John";
        Author updated = new Author.Builder().name(newAuthorName).name(newAuthorName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newAuthorName, updated.getName());
    }

    com.library.repository.impl.people.AuthorRepositoryImpl object = com.library.repository.impl.people.AuthorRepositoryImpl.getRepository();

    AuthorFactory authFac = new AuthorFactory();

    Author test1 = authFac.getAuthor("Chad", "778888");
    Author test2 = authFac.getAuthor("Ameer", "778889");


    @Test
    public void e_delete() {
        object.create(test1);
        this.repository.delete(test1.getAuthID());
        d_getAll();
    }


    @Test
    public void b_read() {
        object.create(test2);
        Author read = object.read(test2.getAuthID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, test2);
    }

    @Test
    public void d_getAll() {
        ArrayList<Author> authors = this.repository.getAll();
        System.out.println("In getall, all = " + authors);
    }
}