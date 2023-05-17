package com.example.ISOperations.dto.stationModel;

import com.example.ISOperations.entities.StationModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StationModelConvectorImpl implements StationModelConvector {

    @Override
    public StationModel toEntity(StationModelDto stationModelDto) {
        StationModel stationModel = null;
        stationModel.setId(stationModelDto.getId());
        stationModel.setStations(stationModelDto.getStations());
        stationModel.setStation_paths(stationModelDto.getStation_paths());
        return stationModel;
    }

    @Override
    public List<StationModel> toListEntity(List<StationModelDto> stationModelDtos) {
        List<StationModel> stationModelList = new ArrayList<>();
        for (StationModelDto stationModelDto: stationModelDtos){
            stationModelList.add(toEntity(stationModelDto));
        }
        return stationModelList;
    }

    @Override
    public StationModelDto toDto(StationModel stationModel) {
        StationModelDto stationModelDto = null;
        stationModelDto.setId(stationModel.getId());
        stationModelDto.setStations(stationModel.getStations());
        stationModelDto.setStation_paths(stationModel.getStation_paths());
        return stationModelDto;
    }

    @Override
    public List<StationModelDto> toListDto(List<StationModel> stationModels) {
        List<StationModelDto> stationModelDtoList = new ArrayList<>();
        for (StationModel stationModel: stationModels) {
            stationModelDtoList.add(toDto(stationModel));
        }
        return stationModelDtoList;
    }
}
