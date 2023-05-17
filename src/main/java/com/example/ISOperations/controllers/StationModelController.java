package com.example.ISOperations.controllers;

import com.example.ISOperations.dto.stationModel.StationModelConvector;
import com.example.ISOperations.dto.stationModel.StationModelDto;
import com.example.ISOperations.entities.CargoNomenclatureReference;
import com.example.ISOperations.entities.StationModel;
import com.example.ISOperations.services.stationModel.StationModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/station_model")
@RequiredArgsConstructor
public class StationModelController {

    private final StationModelService stationModelService;
    private final StationModelConvector stationModelConvector;

    @PostMapping
    public void save(@RequestBody StationModelDto stationModelDto){
        stationModelService.save(stationModelConvector.toEntity(stationModelDto));
    }

    @GetMapping("/{id}")
    public StationModelDto findById(@PathVariable Long id){
        return stationModelConvector.toDto(stationModelService.findById(id).orElseThrow());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody StationModelDto stationModelDto){
        StationModel finedEntity = stationModelService.findById(id).orElseThrow();
        finedEntity.setStations(stationModelDto.getStations());
        finedEntity.setStation_paths(stationModelDto.getStation_paths());
        stationModelService.save(finedEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        StationModel toDelete = stationModelService.findById(id).orElseThrow();
        stationModelService.delete(toDelete);
    }
}
