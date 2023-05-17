package com.example.ISOperations.controllers;

import com.example.ISOperations.dto.wagon.WagonDto;
import com.example.ISOperations.services.transaction.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {


    private final TransactionService transactionService;


    @PostMapping
    public List<WagonDto> wagonReception(@RequestBody List<WagonDto> wagonDtoList){
        return transactionService.wagonReception(wagonDtoList);
    }

    @PutMapping
    public void wagonRearranding(@RequestBody List<WagonDto> wagonDtoList){
        transactionService.wagonRearrding(wagonDtoList);
    }

    @DeleteMapping
    public void wagonDeparture(@RequestBody List<WagonDto> wagonDtoList){
        transactionService.wagonDeparture(wagonDtoList);
    }
}
