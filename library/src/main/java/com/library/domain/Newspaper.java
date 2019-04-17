package com.library.domain;

public class Newspaper {

    private String bookType;


    private Newspaper(){}

    private Newspaper(Builder builder) {
        this.bookType = builder.bookType;
    }

    public String getBookType() {
        return bookType;
    }



    public static class Builder {

        private String bookType;


        public Newspaper.Builder bookType(String bookType) {
            this.bookType = bookType;
            return this;
        }


        public Newspaper build() {
            return new Newspaper(this);
        }

    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
