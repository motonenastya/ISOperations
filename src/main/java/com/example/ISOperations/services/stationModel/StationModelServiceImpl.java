package com.example.ISOperations.services.stationModel;

import com.example.ISOperations.entities.StationModel;
import com.example.ISOperations.repositorys.StationModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StationModelServiceImpl implements StationModelService {

    private final StationModelRepository stationModelRepository;

    @Override
    public void save(StationModel stationModel) {
        stationModelRepository.save(stationModel);
    }

    @Override
    public Optional<StationModel> findById(Long id) {
        return stationModelRepository.findById(id);
    }

    @Override
    public void delete(StationModel stationModel) {
        stationModelRepository.delete(stationModel);
    }
}
