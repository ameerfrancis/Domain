package com.library.factory;

import com.library.domain.FictionBook;

public class FictionBookFactory {

    public static FictionBook getFictionBook(String bookType) {
        return new FictionBook.Builder().bookType(bookType)
                .build();
    }
}
