package com.example.ISOperations.services.wagonPasport;

import com.example.ISOperations.entities.WagonPassport;
import com.example.ISOperations.repositorys.WagonPassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WagonPassportServiceImpl implements WagonPassportService {

    private final WagonPassportRepository wagonPassportRepository;

    @Override
    public void save(WagonPassport wagonPassport) {
        wagonPassportRepository.save(wagonPassport);
    }

    public Optional<WagonPassport> findById(Long id) {
        return wagonPassportRepository.findById(id);
    }

    @Override
    public void deleteById(WagonPassport wagonPassport) {
        wagonPassportRepository.delete(wagonPassport);
    }
}
