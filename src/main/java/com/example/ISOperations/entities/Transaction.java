package com.example.ISOperations.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@Entity
@Data
@Table(name = "transaction")
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TransactionType transactionType;

    @Column(name = "start_station_location")
    private StationModel startStationLocation;

    @Column(name = "result_station_location")
    private StationModel resultStationLocation;

    @Column(name = "start_wagon_location")
    private Long startWagonLocation;

    @Column(name = "result_wagon_location")
    private Long resultWagonLocation;
}
