package com.library.factory.people;

import com.library.domain.people.Junior;


public class JuniorFactory {

    public static Junior getJunior(String name) {
        return new Junior.Builder().name(name)
                .build();
    }
}
