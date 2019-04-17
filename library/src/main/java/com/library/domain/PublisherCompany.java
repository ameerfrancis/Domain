package com.library.domain;

public class PublisherCompany {

    private String name;


    private PublisherCompany(){}

    private PublisherCompany(Builder builder) {
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


        public PublisherCompany build() {
            return new PublisherCompany(this);
        }

    }

    @Override
    public String toString() {
        return "PublisherCompany{" +
                "name='" + name + '\'' +
                '}';
    }
}
