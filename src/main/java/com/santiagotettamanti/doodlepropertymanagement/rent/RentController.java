package com.santiagotettamanti.doodlepropertymanagement.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RentController {
    private final RentService rentService;

    @Autowired
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }
    @GetMapping ("/rent")
    public ArrayList<Rent> getAllRents() {
        ArrayList<Rent> rents = rentService.getRents();
        return rents;
    }
}
