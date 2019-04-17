package com.library.domain;

public class Company {

    private String name;


    private Company(){}

    private Company(Builder builder) {
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


        public Company build() {
            return new Company(this);
        }

    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
