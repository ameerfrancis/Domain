package com.library.factory.supplier;

import com.library.domain.supplier.Lecturer;

public class LecturerFactory {

    public static Lecturer getLecturer(String name) {
        return new Lecturer.Builder().name(name)
                .build();
    }
}
