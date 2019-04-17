package com.library.factory;

import com.library.domain.EducationalBook;

public class EducationalBookFactory {

    public static EducationalBook getEducationalBook(String bookType) {
        return new EducationalBook.Builder().bookType(bookType)
                .build();
    }
}
