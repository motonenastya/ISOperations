package com.example.ISOperations.dto.wagonPasport;

import com.example.ISOperations.entities.Wagon;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WagonPassportDto {

    private Long id;
    private Long number;
    private String type;
    private Double tare_weight;
    private Double load_capacity;
}
