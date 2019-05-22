package com.library.controller.publisher;

import com.library.domain.people.Author;
import com.library.domain.publisher.Publisher;
import com.library.factory.people.AuthorFactory;
import com.library.factory.publisher.PublisherFactory;
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

public class PublisherControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllPublishers() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetPublisherById() {
        Publisher publisher = restTemplate.getForObject(baseURL + "/publisher/1", Publisher.class);
        System.out.println(publisher.getPublisherID());
        assertNotNull(publisher);
    }

    @Ignore
    public void testCreatePublisher() {
        Publisher publisher = PublisherFactory.getPublisher("Bob"," 012");

        ResponseEntity<Publisher> postResponse = restTemplate.postForEntity(baseURL + "/create", publisher, Publisher.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdatePublisher() {
        int id = 1;
        Publisher publisher = restTemplate.getForObject(baseURL + "/publisher/" + id, Publisher.class);

        restTemplate.put(baseURL + "/publishers/" + id, publisher);
        Publisher updatedPublisher = restTemplate.getForObject(baseURL + "/Publisher/" + id, Publisher.class);
        assertNotNull(updatedPublisher);
    }

    @Ignore
    public void testDeletePublisher() {
        int id = 2;
        Publisher publisher = restTemplate.getForObject(baseURL + "/publishers/" + id, Publisher.class);
        assertNotNull(publisher);
        restTemplate.delete(baseURL + "/publishers/" + id);
        try {
            publisher = restTemplate.getForObject(baseURL + "/publishers/" + id, Publisher.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}