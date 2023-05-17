package com.example.ISOperations.services.transaction;

import com.example.ISOperations.dto.wagon.WagonDto;
import com.example.ISOperations.entities.Wagon;

import java.util.List;
import java.util.Optional;

public interface TransactionService {

    List<WagonDto> wagonReception(List<WagonDto> wagonDtoList);

    void wagonRearrding(List<WagonDto> wagonDtoList);

    void wagonDeparture(List<WagonDto> wagonDtoList);
}


