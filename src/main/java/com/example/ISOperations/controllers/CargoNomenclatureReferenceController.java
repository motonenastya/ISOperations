package com.example.ISOperations.controllers;

import com.example.ISOperations.dto.cargoNomenclatureReference.CargoNomenclatureReferenceConvector;
import com.example.ISOperations.dto.cargoNomenclatureReference.CargoNomenclatureReferenceDto;
import com.example.ISOperations.entities.CargoNomenclatureReference;
import com.example.ISOperations.services.cargoNomenclatureReference.CargoNomenclatureReferenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargo_nomenclature_reference_controller")
@RequiredArgsConstructor
public class CargoNomenclatureReferenceController {

    private final CargoNomenclatureReferenceService cargoNomenclatureReferenceService;
    private final CargoNomenclatureReferenceConvector cargoNomenclatureReferenceConvector;

    @PostMapping
    public void save(@RequestBody CargoNomenclatureReferenceDto cargoNomenclatureReferenceDto){
        cargoNomenclatureReferenceService.save(cargoNomenclatureReferenceConvector.toEntity(cargoNomenclatureReferenceDto));
    }

    @GetMapping("/{id}")
    public CargoNomenclatureReferenceDto findById(@PathVariable Long id){
        return cargoNomenclatureReferenceConvector.toDto(cargoNomenclatureReferenceService.findById(id).orElseThrow());
    }


    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CargoNomenclatureReferenceDto cargoNomenclatureReferenceDto){
        CargoNomenclatureReference finedEntity = cargoNomenclatureReferenceService.findById(id).orElseThrow();
        finedEntity.setCargo_name(cargoNomenclatureReferenceDto.getCargo_name());
        finedEntity.setCargo_code(cargoNomenclatureReferenceDto.getCargo_code());
        cargoNomenclatureReferenceService.save(finedEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        CargoNomenclatureReference toDelete = cargoNomenclatureReferenceService.findById(id).orElseThrow();
        cargoNomenclatureReferenceService.delete(toDelete);
    }
}
