package com.library.factory.supplier;

import com.library.domain.supplier.Student;

public class studentFactory {

    public static Student getStudent(String name) {
        return new Student.Builder().name(name)
                .build();
    }
}
