package com.library.repository.impl.people;

import com.library.domain.people.Author;
import com.library.factory.people.AuthorFactory;
import com.library.repository.impl.people.AuthorRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;

public class AuthorRepositoryImplTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }


    AuthorRepositoryImpl object = AuthorRepositoryImpl.getRepository();

    AuthorFactory authFac = new AuthorFactory();

    Author test1 = authFac.getAuthor("Chad", "778888");
    Author test2 = authFac.getAuthor("ameer", "734657");
    Author test3 = authFac.getAuthor("bob", "734657");



    @Test
    public void getRepository()
    {
        AuthorRepositoryImpl author = AuthorRepositoryImpl.getRepository();


        Assert.assertNotNull(author);

    }



    @Test
    public void create() {

        object.create(test1);

        int num = object.getAll().size();

        Assert.assertEquals(1, num);
    }

    @Test
    public void read()
    {
        object.create(test1);
        object.create(test2);

        Author auth = object.read("778888");

        Assert.assertEquals(test1, auth);

    }

    @Test
    public void update()
    {
        object.create(test1);
        object.create(test2);

        Author auth = object.update(test3);

        Assert.assertEquals(test3,auth);

    }

    @Test
    public void delete()
    {
        object.create(test1);

        object.delete("778888");

        Assert.assertEquals(1, object.getAll().size());
    }
}