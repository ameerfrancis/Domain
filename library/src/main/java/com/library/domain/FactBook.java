package com.library.domain;

public class FactBook {

    private String bookType;


    private FactBook(){}

    private FactBook(Builder builder) {
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


        public FactBook build() {
            return new FactBook(this);
        }

    }

    @Override
    public String toString() {
        return "FactBook{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
