package com.library.domain.publisher;

public class Publisher {

    private String publisherName, publisherID;


    private Publisher(){}

    private Publisher(Builder builder) {
        this.publisherName = builder.publisherName;
        this.publisherID = builder.publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getPublisherID() {
        return publisherID;
    }


    public static class Builder {

        private String publisherName, publisherID;


        public Builder publisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public Builder publisherID(String publisherID) {
            this.publisherID = publisherID;
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
                ", publisherID='" + publisherID + '\'' +
                '}';
    }
}
