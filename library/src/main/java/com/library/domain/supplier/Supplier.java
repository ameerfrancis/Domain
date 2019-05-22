package com.library.domain.supplier;

public class Supplier {

    private String supplierName, supplierType;


    private Supplier(){}

    private Supplier(Builder builder) {
        this.supplierName = builder.supplierName;
        this.supplierType = builder.supplierType;
    }

    public String getsupplierName() {
        return supplierName;
    }

    public String getsupplierType() {
        return supplierType;
    }


    public static class Builder {

        private String supplierName, supplierType;


        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public Builder supplierType(String supplierType) {
            this.supplierType = supplierType;
            return this;
        }



        public Supplier build() {
            return new Supplier(this);
        }

    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierName='" + supplierName + '\'' +
                ", supplierType='" + supplierType + '\'' +
                '}';
    }
}
