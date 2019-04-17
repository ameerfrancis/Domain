package com.library.domain;

public class University {

    private String universityName, location;


    private University(){}

    private University(Builder builder) {
        this.universityName = builder.universityName;
        this.location = builder.location;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getLocation() {
        return location;
    }


    public static class Builder {

        private String universityName, location;


        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }



        public University build() {
            return new University(this);
        }

    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
