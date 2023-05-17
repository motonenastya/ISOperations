package com.example.ISOperations.services.stationModel;

import com.example.ISOperations.entities.StationModel;

import java.util.List;
import java.util.Optional;

public interface StationModelService {

    void save(StationModel stationModel);

    Optional<StationModel> findById(Long id);

    void delete(StationModel stationModel);
}
