package com.library.factory;

import com.library.domain.PublisherCompany;

public class PublisherCompanyFactory {

    public static PublisherCompany getPublisherCompany(String name) {
        return new PublisherCompany.Builder().name(name)
                .build();
    }
}
