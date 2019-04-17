package com.library.factory;

import com.library.domain.Textbook;

public class TextbookFactory {

    public static Textbook getTextbook(String bookType) {
        return new Textbook.Builder().bookType(bookType)
                .build();
    }
}
