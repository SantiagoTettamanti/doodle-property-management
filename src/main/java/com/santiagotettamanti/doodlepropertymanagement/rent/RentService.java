package com.santiagotettamanti.doodlepropertymanagement.rent;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RentService {
    private ArrayList<Rent> rents = new ArrayList<>();

    public boolean addRent(Rent rent) {
        rents.add(rent);
        return true;
    }

    public Rent getRentById(int id) {
        for(int i=0; i<rents.size(); i++) {
            Rent currentRent = rents.get(i);
            int RentId = currentRent.getTransactionNumber();
            if(RentId==id) {
                return currentRent;
            }
        }
        return null;
    }
}
