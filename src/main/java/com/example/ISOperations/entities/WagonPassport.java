package com.example.ISOperations.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "wagon_passport")
@NoArgsConstructor
public class WagonPassport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "wagon_number", unique = true, nullable = false)
    private Long number;

    @Column(name = "type")
    private String type;

    @Column(name = "tare_weight")
    private Double tare_weight;

    @Column(name = "load_capacity")
    private Double load_capacity;

    @OneToOne(mappedBy = "wagonPassport")
    private Wagon wagon;
}
