package com.example.ISOperations;

import com.example.ISOperations.entities.Wagon;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ListForReceivingWagons {

    private List<Wagon> wagonsList;
}
