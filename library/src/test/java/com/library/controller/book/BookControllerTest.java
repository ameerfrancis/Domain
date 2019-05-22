package com.library.controller.book;

import com.library.domain.book.Book;
import com.library.domain.people.Author;
import com.library.factory.book.BookFactory;
import com.library.factory.people.AuthorFactory;
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

public class BookControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllBooks() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetBookById() {
        Book book = restTemplate.getForObject(baseURL + "/book/1", Book.class);
        System.out.println(book.getId());
        assertNotNull(book);
    }

    @Ignore
    public void testCreateBook() {
        Book book = BookFactory.getBook("01", "Love", "Jack", "romance", "Sam", "John");

        ResponseEntity<Book> postResponse = restTemplate.postForEntity(baseURL + "/create", book, Book.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateBook() {
        int id = 1;
        Book book = restTemplate.getForObject(baseURL + "/book/" + id, Book.class);

        restTemplate.put(baseURL + "/books/" + id, book);
        Book updatedBook = restTemplate.getForObject(baseURL + "/Book/" + id, Book.class);
        assertNotNull(updatedBook);
    }

    @Ignore
    public void testDeleteBook() {
        int id = 2;
        Book book = restTemplate.getForObject(baseURL + "/books/" + id, Book.class);
        assertNotNull(book);
        restTemplate.delete(baseURL + "/books/" + id);
        try {
            book = restTemplate.getForObject(baseURL + "/books/" + id, Book.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}