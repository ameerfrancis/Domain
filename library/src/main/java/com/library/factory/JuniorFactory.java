package com.library.factory;

import com.library.domain.Junior;


public class JuniorFactory {

    public static Junior getJunior(String name) {
        return new Junior.Builder().name(name)
                .build();
    }
}
