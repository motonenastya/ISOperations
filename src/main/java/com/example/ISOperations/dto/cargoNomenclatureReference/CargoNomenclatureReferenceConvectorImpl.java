package com.example.ISOperations.dto.cargoNomenclatureReference;

import com.example.ISOperations.entities.CargoNomenclatureReference;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CargoNomenclatureReferenceConvectorImpl implements CargoNomenclatureReferenceConvector {

    @Override
    public CargoNomenclatureReference toEntity(CargoNomenclatureReferenceDto cargoNomenclatureReferenceDto) {
        CargoNomenclatureReference cargoNomenclatureReference = null;
        cargoNomenclatureReference.setId(cargoNomenclatureReferenceDto.getId());
        cargoNomenclatureReference.setCargo_code(cargoNomenclatureReferenceDto.getCargo_code());
        cargoNomenclatureReference.setCargo_name(cargoNomenclatureReferenceDto.getCargo_name());
        return cargoNomenclatureReference;
    }

    @Override
    public List<CargoNomenclatureReference> toListEntity(List<CargoNomenclatureReferenceDto> cargoNomenclatureReferenceDtos) {
        List<CargoNomenclatureReference> cargoNomenclatureReferenceList = new ArrayList<>();
        for (CargoNomenclatureReferenceDto cargoNomenclatureReferenceDto: cargoNomenclatureReferenceDtos){
            cargoNomenclatureReferenceList.add(toEntity(cargoNomenclatureReferenceDto));
        }
        return cargoNomenclatureReferenceList;
    }

    @Override
    public CargoNomenclatureReferenceDto toDto(CargoNomenclatureReference cargoNomenclatureReference) {
        CargoNomenclatureReferenceDto cargoNomenclatureReferenceDto = null;
        cargoNomenclatureReferenceDto.setId(cargoNomenclatureReference.getId());
        cargoNomenclatureReferenceDto.setCargo_code(cargoNomenclatureReference.getCargo_code());
        cargoNomenclatureReferenceDto.setCargo_name(cargoNomenclatureReference.getCargo_name());
        return cargoNomenclatureReferenceDto;
    }

    @Override
    public List<CargoNomenclatureReferenceDto> toListDto(List<CargoNomenclatureReference> cargoNomenclatureReferences) {
        List<CargoNomenclatureReferenceDto> cargoNomenclatureReferenceDtoList = new ArrayList<>();
        for (CargoNomenclatureReference cargoNomenclatureReference: cargoNomenclatureReferences) {
            cargoNomenclatureReferenceDtoList.add(toDto(cargoNomenclatureReference));
        }
        return cargoNomenclatureReferenceDtoList;
    }
}
