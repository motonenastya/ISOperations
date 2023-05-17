package com.example.ISOperations.dto.stationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationModelDto {

    private Long id;
    private String stations;
    private Integer station_paths;
}
