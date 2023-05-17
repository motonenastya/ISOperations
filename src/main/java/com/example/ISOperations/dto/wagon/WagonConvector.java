package com.example.ISOperations.dto.wagon;

import com.example.ISOperations.entities.Wagon;

import java.util.List;

public interface WagonConvector {

    Wagon toEntity(WagonDto wagonDto);

    List<Wagon> toListEntity(List<WagonDto> wagonDtos);

    WagonDto toDto(Wagon wagon);

    List<WagonDto> toListDto(List<Wagon> wagons);
}
