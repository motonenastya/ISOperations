package com.example.ISOperations.services.wagonPasport;

import com.example.ISOperations.entities.WagonPassport;

import java.util.Optional;

public interface WagonPassportService {

    void save(WagonPassport wagonPassport);

    Optional<WagonPassport> findById(Long id);

    void deleteById(WagonPassport wagonPassport);
}
