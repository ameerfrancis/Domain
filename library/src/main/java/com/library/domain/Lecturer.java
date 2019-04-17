package com.library.domain;

public class Lecturer {

    private String name;


    private Lecturer(){}

    private Lecturer(Builder builder) {
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


        public Lecturer build() {
            return new Lecturer(this);
        }

    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
