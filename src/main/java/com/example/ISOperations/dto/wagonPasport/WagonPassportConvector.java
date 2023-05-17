package com.example.ISOperations.dto.wagonPasport;

import com.example.ISOperations.entities.WagonPassport;

import java.util.List;

public interface WagonPassportConvector {

    WagonPassport toEntity(WagonPassportDto wagonPassportDto);

    List<WagonPassport> toListEntity(List<WagonPassportDto> wagonPassportDtos);

    WagonPassportDto toDto(WagonPassport wagonPassport);

    List<WagonPassportDto> toListDto(List<WagonPassport> wagonPassports);
}
