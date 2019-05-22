package com.library.domain.people;

public class Librarian {

    private String name, staffNumber, staffType;


    private Librarian(){}

    private Librarian(Builder builder) {
        this.name = builder.name;
        this.staffNumber = builder.staffNumber;
        this.staffType = builder.staffType;
    }

    public String getName() {
        return name;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public String getStaffType() {
        return staffType;
    }


    public static class Builder {

        private String name, staffNumber, staffType ;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder staffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
            return this;
        }

        public Builder staffType(String staffType) {
            this.staffType = staffType;
            return this;
        }


        public Librarian build() {
            return new Librarian(this);
        }

    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + name + '\'' +
                ", staffNumber='" + staffNumber + '\'' +
                ", staffType='" + staffType + '\'' +
                '}';
    }
}
