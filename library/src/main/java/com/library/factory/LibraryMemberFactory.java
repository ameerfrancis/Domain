package com.library.factory;

import com.library.domain.LibraryMember;

public class LibraryMemberFactory {

    public static LibraryMember getLibraryMember(String name) {
        return new LibraryMember.Builder().name(name)
                .build();
    }
}
