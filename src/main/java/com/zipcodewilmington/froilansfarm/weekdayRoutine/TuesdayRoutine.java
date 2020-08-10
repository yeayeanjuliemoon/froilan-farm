package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class TuesdayRoutine implements WeekdayRoutine {
    Tractor tractor ;
    Inventory inv = new Inventory();

    TuesdayRoutine(){
        tractor = new Tractor();
    }

    public void doRoutine(Farm farm, Farmer farmer) {

        List<Stable> stables = farm.getStables();
        for(Stable s : stables){
            for(Horse horse : s.getHorses()){
                horse.ride();
                inv.addMultiple(new EarCorn(), 3);
                horse.feedHorse(this.inv);
            }
        }

        farmer.eatBreakfast(inv);

    }

    public void farmerRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilan")) {
            Field field = farm.getField();
            CropRow cropRows = field.getCropRow();
            List<Crop> cropList = cropRows.getCropList();

            for (Crop crop : cropList) {
                tractor.harvest(crop);
            }
        }
    }

    public void PilotRoutine(Farm farm, Farmer farmer) {

    }
}
