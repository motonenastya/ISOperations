package com.example.ISOperations.dto.cargoNomenclatureReference;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CargoNomenclatureReferenceDto {

    private Long id;
    private Long cargo_code;
    private String cargo_name;
}
