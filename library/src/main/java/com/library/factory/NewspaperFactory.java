package com.library.factory;

import com.library.domain.Newspaper;

public class NewspaperFactory {

    public static Newspaper getNewspaper(String bookType) {
        return new Newspaper.Builder().bookType(bookType)
                .build();
    }
}
