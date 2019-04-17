package com.library.factory;

import com.library.domain.Lecturer;

public class LecturerFactory {

    public static Lecturer getLecturer(String name) {
        return new Lecturer.Builder().name(name)
                .build();
    }
}
