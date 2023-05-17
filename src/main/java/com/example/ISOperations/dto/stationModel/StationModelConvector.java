package com.example.ISOperations.dto.stationModel;

import com.example.ISOperations.entities.StationModel;

import java.util.List;

public interface StationModelConvector {

    StationModel toEntity(StationModelDto stationModelDto);

    List<StationModel> toListEntity(List<StationModelDto> stationModelDtos);

    StationModelDto toDto(StationModel stationModel);

    List<StationModelDto> toListDto(List<StationModel> stationModels);
}
