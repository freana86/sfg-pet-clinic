package com.example.services;

import java.util.Set;

public interface CrudService<T, ID> {
    T save(T object);
    T findById(ID id);
    Set<T> findAll();
}
