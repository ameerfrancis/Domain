package com.library.factory;

import com.library.domain.Librarian;
import com.library.domain.Library;

public class LibrarianFactory {

    public static Librarian getLibrarian(String name, String sNumber, String sType) {
        return new Librarian.Builder().name(name)
                .staffNumber(sNumber)
                .staffType(sType)
                .build();
    }
}
