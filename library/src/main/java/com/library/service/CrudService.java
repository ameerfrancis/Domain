package com.library.service;

public interface CrudService<A, ID> {

    A create(A t);
    A update(A t);
    void delete(ID id);
    A read(ID id);
}
