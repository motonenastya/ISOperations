package com.example.ISOperations.repositorys;

import com.example.ISOperations.entities.StationModel;
import com.example.ISOperations.entities.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationModelRepository extends JpaRepository<StationModel, Long> {
}
