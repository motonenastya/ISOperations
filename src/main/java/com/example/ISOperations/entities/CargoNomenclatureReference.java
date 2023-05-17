package com.example.ISOperations.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "cargo_nomenclature_reference")
public class CargoNomenclatureReference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cargo_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "cargo_code", unique = true, nullable = false)
    private Long cargo_code;

    @Column(name = "cargo_name")
    private String cargo_name;

    @OneToMany(mappedBy="cargoNomenclatureReference")
    private Set<Wagon> wagon;

}
