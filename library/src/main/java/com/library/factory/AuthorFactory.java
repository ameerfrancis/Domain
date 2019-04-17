package com.library.factory;

import com.library.domain.Author;

public class AuthorFactory {

    public static Author getAuthor(String name) {
        return new Author.Builder().name(name)
                .build();
    }
}
