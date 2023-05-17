package com.example.ISOperations.services.cargoNomenclatureReference;

import com.example.ISOperations.entities.CargoNomenclatureReference;
import com.example.ISOperations.repositorys.CargoNomenclatureReferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CargoNomenclatureReferenceServiceImpl implements CargoNomenclatureReferenceService {

    private final CargoNomenclatureReferenceRepository cargoNomenclatureReferenceRepository;

    @Override
    public void save(CargoNomenclatureReference cargoNomenclatureReference) {
       cargoNomenclatureReferenceRepository.save(cargoNomenclatureReference);
    }

    @Override
    public Optional<CargoNomenclatureReference> findById(Long id) {
        return cargoNomenclatureReferenceRepository.findById(id);
    }

    @Override
    public void delete(CargoNomenclatureReference cargoNomenclatureReference) {
        cargoNomenclatureReferenceRepository.delete(cargoNomenclatureReference);
    }
}
