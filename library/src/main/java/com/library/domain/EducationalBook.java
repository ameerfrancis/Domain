package com.library.domain;

public class EducationalBook {

    private String bookType;

    private EducationalBook(){}

    private EducationalBook(Builder builder) {
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


        public EducationalBook build() {
            return new EducationalBook(this);
        }

    }

    @Override
    public String toString() {
        return "EducationalBook{" +
                "bookType='" + bookType + '\'' +
                '}';
    }
}
