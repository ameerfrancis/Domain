package com.library.factory;

import com.library.domain.Genre;

public class GenreFactory {

    public static Genre getGenre(String name) {
        return new Genre.Builder().name(name)
                .build();
    }
}
