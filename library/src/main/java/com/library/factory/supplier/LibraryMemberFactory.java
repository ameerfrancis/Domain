package com.library.factory.supplier;

import com.library.domain.supplier.LibraryMember;

public class LibraryMemberFactory {

    public static LibraryMember getLibraryMember(String name) {
        return new LibraryMember.Builder().name(name)
                .build();
    }
}
