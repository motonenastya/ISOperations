package com.example.ISOperations.services.wagon;

import com.example.ISOperations.entities.Wagon;

import java.util.Optional;

public interface WagonService {

    void save(Wagon wagon);

    Optional<Wagon> findById(Long id);

    void deleteById(Wagon wagon);
}
