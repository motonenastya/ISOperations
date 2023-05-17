package com.example.ISOperations.services.cargoNomenclatureReference;

import com.example.ISOperations.entities.CargoNomenclatureReference;

import java.util.List;
import java.util.Optional;

public interface CargoNomenclatureReferenceService {

    void save(CargoNomenclatureReference cargoNomenclatureReference);

    Optional<CargoNomenclatureReference> findById(Long id);

    void delete(CargoNomenclatureReference cargoNomenclatureReference);
}
