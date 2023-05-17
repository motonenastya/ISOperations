package com.example.ISOperations.repositorys;

import com.example.ISOperations.entities.CargoNomenclatureReference;
import com.example.ISOperations.entities.StationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoNomenclatureReferenceRepository extends JpaRepository<CargoNomenclatureReference, Long> {
}
