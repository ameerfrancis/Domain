package com.library.factory.people;

import com.library.domain.people.Librarian;

public class LibrarianFactory {

    public static Librarian getLibrarian(String name, String sNumber, String sType) {
        return new Librarian.Builder().name(name)
                .staffNumber(sNumber)
                .staffType(sType)
                .build();
    }
}
