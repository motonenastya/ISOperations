package com.example.ISOperations.services.wagon;

import com.example.ISOperations.entities.Wagon;
import com.example.ISOperations.repositorys.WagonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WagonServiceImpl implements WagonService {

    private final WagonRepository wagonRepository;

    @Override
    public void save(Wagon wagon) {
        wagonRepository.save(wagon);
    }

    @Override
    public Optional<Wagon> findById(Long id) {
        return wagonRepository.findById(id);
    }

    @Override
    public void deleteById(Wagon wagon) {
        wagonRepository.delete(wagon);
    }
}
