package com.library.factory.location;

import com.library.domain.location.Library;

public class LibraryFactory {

    public static Library getLibrary(String uniName) {
        return new Library.Builder().universityName(uniName)
                .build();
    }
}
