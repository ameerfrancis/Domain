package com.library.factory;

import com.library.domain.Journal;

public class JournalFactory {

    public static Journal getJournal(String bookType) {
        return new Journal.Builder().bookType(bookType)
                .build();
    }
}
