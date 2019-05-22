package com.library.factory.publisher;

import com.library.domain.publisher.Publisher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PublisherFactoryTest {

    Publisher p = PublisherFactory.getPublisher("Bob", "01");


    @Test
    public void getPublisher() {

        Assert.assertEquals("01", p.getPublisherID());
    }
}