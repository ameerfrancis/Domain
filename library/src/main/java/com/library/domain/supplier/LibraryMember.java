package com.library.domain.supplier;

public class LibraryMember {

    private String name;


    private LibraryMember(){}

    private LibraryMember(Builder builder) {
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


        public LibraryMember build() {
            return new LibraryMember(this);
        }

    }

    @Override
    public String toString() {
        return "LibraryMember{" +
                "name='" + name + '\'' +
                '}';
    }
}
