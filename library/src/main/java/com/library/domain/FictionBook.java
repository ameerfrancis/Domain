package com.library.domain;

public class FictionBook {

    private String bookType;


    private FictionBook(){}

    private FictionBook(Builder builder) {
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


        public FictionBook build() {
            return new FictionBook(this);
        }

    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
