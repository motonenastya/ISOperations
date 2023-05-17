package com.example.ISOperations.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Table(name = "station_model")
@NoArgsConstructor
public class StationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "stations")
    private String stations;

    @Column(name = "station_paths")
    private Integer station_paths;

    @OneToMany(mappedBy = "stationModel")
    private Set<Wagon> wagon;
}
