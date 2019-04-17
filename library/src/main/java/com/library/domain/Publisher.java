package com.library.domain;

public class Publisher {

    private String publisherName, publisherType;


    private Publisher(){}

    private Publisher(Builder builder) {
        this.publisherName = builder.publisherName;
        this.publisherType = builder.publisherType;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getPublisherType() {
        return publisherType;
    }


    public static class Builder {

        private String publisherName, publisherType;


        public Builder publisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public Builder publisherType(String publisherType) {
            this.publisherType = publisherType;
            return this;
        }



        public Publisher build() {
            return new Publisher(this);
        }

    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                ", publisherType='" + publisherType + '\'' +
                '}';
    }
}
