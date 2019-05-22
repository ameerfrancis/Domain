package com.library.factory.location;

import com.library.domain.location.Faculty;


public class FacultyFactory {

    public static Faculty getFaculty(String name) {
        return new Faculty.Builder().name(name)
                .build();
    }
}
