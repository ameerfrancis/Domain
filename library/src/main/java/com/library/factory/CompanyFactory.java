package com.library.factory;

import com.library.domain.Company;

public class CompanyFactory {

    public static Company getCompany(String name) {
        return new Company.Builder().name(name)
                .build();
    }
}
