package com.library.repository;

public interface CrudRepository<A, ID> {
    A create(A a);
    A update(A a);
    void delete(ID id);
    A read(ID id);

}
