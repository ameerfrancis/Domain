package com.library.factory;

import com.library.domain.Senior;

public class SeniorFactory {

    public static Senior getSenior(String name) {
        return new Senior.Builder().name(name)
                .build();
    }
}
