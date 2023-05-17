package com.example.ISOperations.services.transaction;

import com.example.ISOperations.dto.wagon.WagonConvector;
import com.example.ISOperations.dto.wagon.WagonDto;
import com.example.ISOperations.entities.Transaction;
import com.example.ISOperations.entities.TransactionType;
import com.example.ISOperations.entities.Wagon;
import com.example.ISOperations.services.wagon.WagonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private List<Wagon> railwayTrain;
    private WagonConvector wagonConvector;
    private WagonService wagonService;

    @Override
    public List<WagonDto> wagonReception(List<WagonDto> wagonDtoList) {
        List<Wagon> wagonList = wagonConvector.toListEntity(wagonDtoList);
        for (Wagon wagon: wagonList){
            Wagon startWagon = wagonService.findById(wagon.getId()).orElseThrow();
            Transaction transaction = new Transaction();
            transaction.setTransactionType(TransactionType.valueOf("RECEPTION"));
            transaction.setStartWagonLocation(startWagon.getOrdinalNumber());
            transaction.setStartStationLocation(startWagon.getStationModel());
            wagonService.save(wagon);
            transaction.setResultWagonLocation(wagon.getOrdinalNumber());
            transaction.setResultStationLocation(wagon.getStationModel());
            railwayTrain.add(railwayTrain.size()+1, wagon);
        }
        return wagonConvector.toListDto(railwayTrain);
    }

    @Override
    public void wagonRearrding(List<WagonDto> wagonDtoList) {
        List<Wagon> wagonList = wagonConvector.toListEntity(wagonDtoList);
        for (Wagon wagon: wagonList){
            Wagon startWagon = wagonService.findById(wagon.getId()).orElseThrow();
            Transaction transaction = new Transaction();
            transaction.setTransactionType(TransactionType.valueOf("REARRDING"));
            transaction.setStartWagonLocation(startWagon.getOrdinalNumber());
            transaction.setStartStationLocation(startWagon.getStationModel());
            wagonService.save(wagon);
            transaction.setResultWagonLocation(wagon.getOrdinalNumber());
            transaction.setResultStationLocation(wagon.getStationModel());
            railwayTrain.remove(wagon);
            railwayTrain.add(railwayTrain.size()+1, wagon);
        }
    }

    @Override
    public void wagonDeparture(List<WagonDto> wagonDtoList) {
        List<Wagon> wagonList = wagonConvector.toListEntity(wagonDtoList);
        for (Wagon wagon: wagonList){
            for (int i = 0; i < railwayTrain.size(); i++){
                if(railwayTrain.get(i).equals(wagon)){
                    railwayTrain.remove(i);

                    Wagon startWagon = wagonService.findById(wagon.getId()).orElseThrow();
                    Transaction transaction = new Transaction();
                    transaction.setTransactionType(TransactionType.valueOf("DEPARTURE"));
                    transaction.setStartWagonLocation(startWagon.getOrdinalNumber());
                    transaction.setStartStationLocation(startWagon.getStationModel());
                    wagonService.deleteById(wagon);
                    transaction.setResultWagonLocation(null);
                    transaction.setResultStationLocation(null);
                }
            }
        }
    }


}
