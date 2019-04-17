package com.library.domain;

public class Magazine {

    private String bookType;


    private Magazine(){}

    private Magazine(Builder builder) {
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


        public Magazine build() {
            return new Magazine(this);
        }

    }

    @Override
    public String toString() {
        return "Magazine{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
