package com.library.factory.location;


import com.library.domain.location.University;

public class UniversityFactory {

    public static University getUniversity(String uniName, String location) {
        return new University.Builder().universityName(uniName)
                .location(location)
                .build();
    }
}
