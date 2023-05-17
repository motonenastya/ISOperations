package com.example.ISOperations.dto.cargoNomenclatureReference;

import com.example.ISOperations.entities.CargoNomenclatureReference;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CargoNomenclatureReferenceConvector {

    CargoNomenclatureReference toEntity(CargoNomenclatureReferenceDto cargoNomenclatureReferenceDto);

    List<CargoNomenclatureReference> toListEntity(List<CargoNomenclatureReferenceDto> cargoNomenclatureReferenceDtos);

    CargoNomenclatureReferenceDto toDto(CargoNomenclatureReference cargoNomenclatureReference);

    List<CargoNomenclatureReferenceDto> toListDto(List<CargoNomenclatureReference> cargoNomenclatureReferences);
}
