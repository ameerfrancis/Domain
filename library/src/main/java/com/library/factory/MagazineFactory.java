package com.library.factory;

import com.library.domain.Magazine;

public class MagazineFactory {

    public static Magazine getMagazine(String bookType) {
        return new Magazine.Builder().bookType(bookType)
                .build();
    }
}
