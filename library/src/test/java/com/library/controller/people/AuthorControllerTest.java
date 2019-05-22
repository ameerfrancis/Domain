package com.library.controller.people;

import com.library.domain.people.Author;
import com.library.factory.people.AuthorFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AuthorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllAuthors() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetAuthorById() {
        Author author = restTemplate.getForObject(baseURL + "/author/1", Author.class);
        System.out.println(author.getAuthID());
        assertNotNull(author);
    }

    @Ignore
    public void testCreateAuthor() {
        Author author = AuthorFactory.getAuthor("John"," 001");

        ResponseEntity<Author> postResponse = restTemplate.postForEntity(baseURL + "/create", author, Author.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateAuthor() {
        int id = 1;
        Author author = restTemplate.getForObject(baseURL + "/author/" + id, Author.class);

        restTemplate.put(baseURL + "/authors/" + id, author);
        Author updatedAuthor = restTemplate.getForObject(baseURL + "/Author/" + id, Author.class);
        assertNotNull(updatedAuthor);
    }

    @Ignore
    public void testDeleteAuthor() {
        int id = 2;
        Author author = restTemplate.getForObject(baseURL + "/authors/" + id, Author.class);
        assertNotNull(author);
        restTemplate.delete(baseURL + "/authors/" + id);
        try {
            author = restTemplate.getForObject(baseURL + "/authors/" + id, Author.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}