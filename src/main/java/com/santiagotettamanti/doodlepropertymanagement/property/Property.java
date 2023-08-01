package com.santiagotettamanti.doodlepropertymanagement.property;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Property {
   private int propertyId;
   private String address;
   private int numberOfUnits;
   private LocalDate yearBuilt;

   public int getPropertyId() {
       return propertyId;
   }

   public void setPropertyId(int propertyId) {
       this.propertyId = propertyId;
   }

   public String getAddress() {
       return address;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public int getNumberOfUnits() {
       return numberOfUnits;
   }

   public void setNumberOfUnits(int numberOfUnits) {
       this.numberOfUnits = numberOfUnits;
   }

   public LocalDate getYearBuilt() {
       return yearBuilt;
   }

   public void setYearBuilt(LocalDate yearBuilt) {
       this.yearBuilt = yearBuilt;
   }

}
