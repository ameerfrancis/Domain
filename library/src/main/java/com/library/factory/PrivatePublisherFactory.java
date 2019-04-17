package com.library.factory;

import com.library.domain.PrivatePublisher;

public class PrivatePublisherFactory {

    public static PrivatePublisher getPrivatePublisher(String name) {
        return new PrivatePublisher.Builder().name(name)
                .build();
    }
}
