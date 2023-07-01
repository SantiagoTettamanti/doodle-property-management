package com.santiagotettamanti.doodlepropertymanagement.rent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RentController {
    @GetMapping ("/rent")
    public ArrayList<Rent> getAllRents() {
        return null; //for now ;p
    }
}
