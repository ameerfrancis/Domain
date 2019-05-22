package com.library.factory.publisher;

import com.library.domain.publisher.Publisher;

public class PublisherFactory {

    public static Publisher getPublisher(String publisherName, String publisherID) {
        return new Publisher.Builder().publisherName(publisherName)
                .publisherID(publisherID)
                .build();
    }
}
