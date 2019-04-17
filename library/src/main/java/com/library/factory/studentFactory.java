package com.library.factory;

import com.library.domain.Student;

public class studentFactory {

    public static Student getStudent(String name) {
        return new Student.Builder().name(name)
                .build();
    }
}
