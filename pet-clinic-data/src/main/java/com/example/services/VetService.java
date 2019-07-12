package com.example.services;

import com.example.model.Pet;
import com.example.model.Vet;

import java.util.Set;

public interface VetService {
    Vet save(Vet vet);
    Vet findById(Long id);
    Set<Vet> findAll();
}
