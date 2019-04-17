package com.library.factory;

import com.library.domain.Library;

public class LibraryFactory {

    public static Library getLibrary(String uniName) {
        return new Library.Builder().universityName(uniName)
                .build();
    }
}
