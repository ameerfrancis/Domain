package com.library.factory.supplier;

import com.library.domain.supplier.Company;

public class CompanyFactory {

    public static Company getCompany(String name) {
        return new Company.Builder().name(name)
                .build();
    }
}
