package com.example.ISOperations.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "wagon")
@NoArgsConstructor
public class Wagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "ordinal_number")
    private Long ordinalNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "wagon_number")
    private WagonPassport wagonPassport;

    @ManyToOne
    @JoinColumn(name = "cargo_id", nullable = false)
    private CargoNomenclatureReference cargoNomenclatureReference;

    @Column(name = "weight_of_cargo_in_wagon")
    private Double weightOfCargoInWagon;

    @Column(name = "weight_of_wagon")
    private Double weightOfWagon;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private StationModel stationModel;
}
