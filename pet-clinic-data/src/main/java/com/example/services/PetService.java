package com.example.services;

import com.example.model.Pet;

import java.util.Set;

public interface PetService {
    Pet save(Pet pet);
    Pet findById(Long id);
    Set<Pet> findAll();
}
