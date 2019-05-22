package com.library.factory.publisher;

import com.library.domain.publisher.PublisherCompany;

public class PublisherCompanyFactory {

    public static PublisherCompany getPublisherCompany(String name) {
        return new PublisherCompany.Builder().name(name)
                .build();
    }
}
