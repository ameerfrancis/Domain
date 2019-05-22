package com.library.domain.publisher;

import com.library.factory.publisher.PublisherFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PublisherTest {

    Publisher p = PublisherFactory.getPublisher("Bob", "01");

    @Test
    public void getPublisherName() {

        Assert.assertEquals("Bob", p.getPublisherName());
    }

    @Test
    public void getPublisherID() {
        Assert.assertEquals("01", p.getPublisherID());

    }
}