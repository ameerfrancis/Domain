package com.library.domain;

public class PrivatePublisher {

    private String name;


    private PrivatePublisher(){}

    private PrivatePublisher(Builder builder) {
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


        public PrivatePublisher build() {
            return new PrivatePublisher(this);
        }

    }

    @Override
    public String toString() {
        return "PrivatePublisher{" +
                "name='" + name + '\'' +
                '}';
    }
}
