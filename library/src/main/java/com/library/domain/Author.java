package com.library.domain;

public class Author {

    private String name;


    private Author(){}

    private Author(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }



    public static class Builder {

        private String name;


        public Author.Builder name(String name) {
            this.name = name;
            return this;
        }


        public Author build() {
            return new Author(this);
        }

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
