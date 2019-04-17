package com.library.factory;


import com.library.domain.University;

public class UniversityFactory {

    public static University getUniversity(String uniName, String location) {
        return new University.Builder().universityName(uniName)
                .location(location)
                .build();
    }
}
