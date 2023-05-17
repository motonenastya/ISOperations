package com.example.ISOperations.dto.wagonPasport;

import com.example.ISOperations.entities.WagonPassport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WagonPassportConvectorImpl implements WagonPassportConvector {
    @Override
    public WagonPassport toEntity(WagonPassportDto wagonPassportDto) {
        WagonPassport wagonPassport = null;
        wagonPassport.setId(wagonPassportDto.getId());
        wagonPassport.setNumber(wagonPassportDto.getNumber());
        wagonPassport.setType(wagonPassportDto.getType());
        wagonPassport.setTare_weight(wagonPassportDto.getTare_weight());
        wagonPassport.setLoad_capacity(wagonPassportDto.getLoad_capacity());
        return wagonPassport;
    }

    @Override
    public List<WagonPassport> toListEntity(List<WagonPassportDto> wagonPassportDtos) {
        List<WagonPassport> wagonPassportList = new ArrayList<>();
        for (WagonPassportDto wagonPassportDto: wagonPassportDtos){
            wagonPassportList.add(toEntity(wagonPassportDto));
        }
        return wagonPassportList;
    }

    @Override
    public WagonPassportDto toDto(WagonPassport wagonPassport) {
        WagonPassportDto wagonPassportDto = null;
        wagonPassportDto.setId(wagonPassport.getId());
        wagonPassportDto.setNumber(wagonPassport.getNumber());
        wagonPassportDto.setType(wagonPassport.getType());
        wagonPassportDto.setTare_weight(wagonPassport.getTare_weight());
        wagonPassportDto.setLoad_capacity(wagonPassport.getLoad_capacity());
        return wagonPassportDto;
    }

    @Override
    public List<WagonPassportDto> toListDto(List<WagonPassport> wagonPassports) {
        List<WagonPassportDto> wagonPassportDtoList = new ArrayList<>();
        for (WagonPassport wagonPassport: wagonPassports) {
            wagonPassportDtoList.add(toDto(wagonPassport));
        }
        return wagonPassportDtoList;
    }
}
