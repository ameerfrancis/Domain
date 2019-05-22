package com.library.domain.location;

public class Faculty {

    private String name;


    private Faculty(){}

    private Faculty(Builder builder) {
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


        public Faculty build() {
            return new Faculty(this);
        }

    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}
