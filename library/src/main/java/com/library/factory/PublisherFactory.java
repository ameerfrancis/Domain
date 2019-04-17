package com.library.factory;

import com.library.domain.Publisher;

public class PublisherFactory {

    public static Publisher getPublisher(String publisherName, String publisherType) {
        return new Publisher.Builder().publisherName(publisherName)
                .publisherType(publisherType)
                .build();
    }
}
