package com.library.domain;


public class Library {

    private String universityName;


    private Library(){}

    private Library(Builder builder) {
        this.universityName = builder.universityName;
    }

    public String getUniversityName() {
        return universityName;
    }


    public static class Builder {

        private String universityName;


        public Builder universityName( String universityName) {
            this.universityName = universityName;
            return this;
        }


        public Library build() {
            return new Library(this);
        }

    }

    @Override
    public String toString() {
        return "Library{" +
                "universityName='" + universityName + '\'' +
                '}';
    }
}
