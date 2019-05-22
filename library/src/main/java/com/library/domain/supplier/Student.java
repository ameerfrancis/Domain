package com.library.domain.supplier;

public class Student {

    private String name;


    private Student(){}

    private Student(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }



    public static class Builder {

        private String name;


        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
