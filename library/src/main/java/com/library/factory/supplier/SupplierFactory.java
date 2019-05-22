package com.library.factory.supplier;

import com.library.domain.supplier.Supplier;


public class SupplierFactory {

    public static Supplier getSupplier(String supplierName, String supplierType) {
        return new Supplier.Builder().supplierName(supplierName)
                .supplierType(supplierType)
                .build();
    }
}
