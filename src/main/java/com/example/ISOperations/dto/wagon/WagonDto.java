package com.example.ISOperations.dto.wagon;

import com.example.ISOperations.entities.CargoNomenclatureReference;
import com.example.ISOperations.entities.StationModel;
import com.example.ISOperations.entities.WagonPassport;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WagonDto {

    private Long id;
    private Long ordinalNumber;
    private Double weightOfCargoInWagon;
    private Double weightOfWagon;
    private StationModel stationModel;
}
