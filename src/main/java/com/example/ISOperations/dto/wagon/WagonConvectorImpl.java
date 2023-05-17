package com.example.ISOperations.dto.wagon;

import com.example.ISOperations.entities.Wagon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WagonConvectorImpl implements WagonConvector {
    @Override
    public Wagon toEntity(WagonDto wagonDto) {
        Wagon wagon = null;
        wagon.setId(wagonDto.getId());
        wagon.setOrdinalNumber(wagonDto.getOrdinalNumber());
        wagon.setWeightOfCargoInWagon(wagonDto.getWeightOfCargoInWagon());
        wagon.setWeightOfWagon(wagonDto.getWeightOfWagon());
        return wagon;
    }

    @Override
    public List<Wagon> toListEntity(List<WagonDto> wagonDtos) {
        List<Wagon> wagonList = new ArrayList<>();
        for (WagonDto wagonDto: wagonDtos){
            wagonList.add(toEntity(wagonDto));
        }
        return wagonList;
    }

    @Override
    public WagonDto toDto(Wagon wagon) {
        WagonDto wagonDto = null;
        wagonDto.setId(wagon.getId());
        wagonDto.setOrdinalNumber(wagon.getOrdinalNumber());
        wagonDto.setWeightOfCargoInWagon(wagon.getWeightOfCargoInWagon());
        wagonDto.setWeightOfWagon(wagon.getWeightOfWagon());
        return wagonDto;
    }

    @Override
    public List<WagonDto> toListDto(List<Wagon> wagons) {
        List<WagonDto> wagonDtoList = new ArrayList<>();
        for (Wagon wagon: wagons) {
            wagonDtoList.add(toDto(wagon));
        }
        return wagonDtoList;
    }
}
