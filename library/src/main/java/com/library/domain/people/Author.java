package com.library.domain.people;

//import javax.persistence.*;

//@Entity
public class Author {
    
    //@Id
    //@GeneratedValue
    //@Column(name = "id")
    private String authID;
    //@Column(name = "name")
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


        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder authID(String authID)
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
