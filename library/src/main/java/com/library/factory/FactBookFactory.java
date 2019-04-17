package com.library.factory;

import com.library.domain.FactBook;

public class FactBookFactory {

    public static FactBook getFactBook(String bookType) {
        return new FactBook.Builder().bookType(bookType)
                .build();
    }
}
