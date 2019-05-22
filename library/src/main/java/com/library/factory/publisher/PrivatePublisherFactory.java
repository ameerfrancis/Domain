package com.library.factory.publisher;

import com.library.domain.publisher.PrivatePublisher;

public class PrivatePublisherFactory {

    public static PrivatePublisher getPrivatePublisher(String name) {
        return new PrivatePublisher.Builder().name(name)
                .build();
    }
}
