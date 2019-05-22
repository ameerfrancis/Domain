package com.library.factory.people;

import com.library.domain.people.Senior;

public class SeniorFactory {

    public static Senior getSenior(String name) {
        return new Senior.Builder().name(name)
                .build();
    }
}
