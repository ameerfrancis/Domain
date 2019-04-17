package com.library.domain;

public class Section {

    private String sectionName;


    private Section(){}

    private Section(Builder builder) {
        this.sectionName = builder.sectionName;
    }

    public String getSectionName() {
        return sectionName;
    }


    public static class Builder {

        private String sectionName;


        public Builder sectionName(String sectionName) {
            this.sectionName = sectionName;
            return this;
        }


        public Section build() {
            return new Section(this);
        }

    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                '}';
    }
}
