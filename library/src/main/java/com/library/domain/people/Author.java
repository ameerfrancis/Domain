package com.library.domain.people;

public class Author {
    
    private String authID;
    private String name;


    private Author(){}

    private Author(Builder builder) {
        this.name = builder.name;
        this.authID = builder.authID;
    }

    public String getName() {
        return name;
    }

    public String getAuthID() {
        return authID;
    }



    public static class Builder {

        private String name;
        private String authID;


        public Author.Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Author.Builder authID(String authID)
        {
            this.authID = authID;
            return this;
        }


        public Author build() {
            return new Author(this);
        }

    }

    @Override
    public String toString() {
        return "Author{" +
                "authID='" + authID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
