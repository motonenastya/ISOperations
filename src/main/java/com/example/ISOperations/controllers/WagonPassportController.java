package com.example.ISOperations.controllers;

import com.example.ISOperations.dto.wagonPasport.WagonPassportConvector;
import com.example.ISOperations.dto.wagonPasport.WagonPassportDto;
import com.example.ISOperations.entities.Wagon;
import com.example.ISOperations.entities.WagonPassport;
import com.example.ISOperations.services.wagonPasport.WagonPassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wagon_passport")
@RequiredArgsConstructor
public class WagonPassportController {

    private final WagonPassportService wagonPassportService;
    private final WagonPassportConvector wagonPassportConvector;

    @PostMapping
    public void save(@RequestBody WagonPassportDto wagonPassportDto){
        wagonPassportService.save(wagonPassportConvector.toEntity(wagonPassportDto));
    }

    @GetMapping("/{id}")
    public WagonPassportDto findById(@PathVariable Long id){
        return wagonPassportConvector.toDto(wagonPassportService.findById(id).orElseThrow());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody WagonPassportDto wagonPassportDto){
        WagonPassport finedEntity = wagonPassportService.findById(id).orElseThrow();
        finedEntity.setLoad_capacity(wagonPassportDto.getLoad_capacity());
        finedEntity.setNumber(wagonPassportDto.getNumber());
        finedEntity.setTare_weight(wagonPassportDto.getTare_weight());
        wagonPassportService.save(finedEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        WagonPassport toDelete = wagonPassportService.findById(id).orElseThrow();
        wagonPassportService.deleteById(toDelete);
    }
}
