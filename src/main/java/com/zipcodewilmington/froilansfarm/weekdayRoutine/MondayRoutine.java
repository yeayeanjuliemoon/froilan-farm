package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class MondayRoutine implements WeekdayRoutine {
    Inventory inv = new Inventory();


    public void doRoutine(Farm farm, Farmer farmer) {
        List<Stable> stables = farm.getStables();
        for(Stable s : stables){
            for(Horse horse : s.getHorses()){
                horse.ride();
                inv.addMultiple(new EarCorn(), 3);
                horse.feedHorse(this.inv);
            }
        }
        boolean hasEaten = farmer.eatBreakfast(inv);
    }

    public void farmerRoutine(Farm farm, Farmer farmer) {

    }


    public void pilotRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilanda")) {
            farm.getAircraft().fly();
            Field field = farm.getField();
            CropRow cropRows = field.getCropRow();
            List<Crop> cropList = cropRows.getCropList();
            for (Crop crop : cropList) {
                field.fertilizeField();
            }
        }
    }
}
