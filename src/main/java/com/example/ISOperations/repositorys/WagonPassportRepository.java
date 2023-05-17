package com.example.ISOperations.repositorys;

import com.example.ISOperations.entities.WagonPassport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonPassportRepository extends JpaRepository<WagonPassport, Long> {
}
