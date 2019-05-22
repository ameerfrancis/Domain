package com.library.domain.people;

public class Senior {

    private String name;


    private Senior(){}

    private Senior(Builder builder) {
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


        public Senior build() {
            return new Senior(this);
        }

    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + name + '\'' +
                '}';
    }
}
