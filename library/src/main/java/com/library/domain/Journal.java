package com.library.domain;

public class Journal {

    private String bookType;


    private Journal(){}

    private Journal(Builder builder) {
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


        public Journal build() {
            return new Journal(this);
        }

    }

    @Override
    public String toString() {
        return "Journal{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
