package com.example.services;

import com.example.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> { ;
    Owner findByLastName(String lastName);
}
