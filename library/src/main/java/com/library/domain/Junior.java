package com.library.domain;

public class Junior {

    private String name;


    private Junior(){}

    private Junior(Builder builder) {
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


        public Junior build() {
            return new Junior(this);
        }

    }

    @Override
    public String toString() {
        return "Junior{" +
                "name='" + name + '\'' +
                '}';
    }
}
