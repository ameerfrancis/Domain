package com.library.factory;

import com.library.domain.Supplier;


public class SupplierFactory {

    public static Supplier getSupplier(String supplierName, String supplierType) {
        return new Supplier.Builder().supplierName(supplierName)
                .supplierType(supplierType)
                .build();
    }
}
