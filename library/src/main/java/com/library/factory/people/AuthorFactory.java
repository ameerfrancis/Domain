package com.library.factory.people;

import com.library.domain.people.Author;

public class AuthorFactory {

    public static Author getAuthor(String name, String authId) {
        return new Author.Builder().name(name)
                .authID(authId)
                .build();
    }
}
