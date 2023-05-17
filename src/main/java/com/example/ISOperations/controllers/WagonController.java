package com.example.ISOperations.controllers;

import com.example.ISOperations.dto.wagon.WagonConvector;
import com.example.ISOperations.dto.wagon.WagonDto;
import com.example.ISOperations.entities.StationModel;
import com.example.ISOperations.entities.Wagon;
import com.example.ISOperations.services.wagon.WagonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wagon")
@RequiredArgsConstructor
public class WagonController {

    private final WagonService wagonService;
    private final WagonConvector wagonConvector;

    @PostMapping
    public void save(@RequestBody WagonDto wagonDto){
        wagonService.save(wagonConvector.toEntity(wagonDto));
    }

    @GetMapping("/{id}")
    public WagonDto findById(@PathVariable Long id){
        return wagonConvector.toDto(wagonService.findById(id).orElseThrow());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody WagonDto wagonDto){
        Wagon finedEntity = wagonService.findById(id).orElseThrow();
        finedEntity.setWeightOfWagon(wagonDto.getWeightOfWagon());
        finedEntity.setWeightOfCargoInWagon(wagonDto.getWeightOfCargoInWagon());
        finedEntity.setOrdinalNumber(wagonDto.getOrdinalNumber());
        wagonService.save(finedEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        Wagon toDelete = wagonService.findById(id).orElseThrow();
        wagonService.deleteById(toDelete);
    }
}
