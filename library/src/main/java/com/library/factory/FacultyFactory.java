package com.library.factory;

import com.library.domain.Faculty;


public class FacultyFactory {

    public static Faculty getFaculty(String name) {
        return new Faculty.Builder().name(name)
                .build();
    }
}
