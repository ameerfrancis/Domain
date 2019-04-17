package com.library.domain;

public class Textbook {

    private String bookType;


    private Textbook(){}

    private Textbook(Builder builder) {
        this.bookType = builder.bookType;
    }

    public String getBookType() {
        return bookType;
    }



    public static class Builder {

        private String bookType;


        public Builder bookType(String bookType) {
            this.bookType = bookType;
            return this;
        }


        public Textbook build() {
            return new Textbook(this);
        }

    }

    @Override
    public String toString() {
        return "Textbook{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
