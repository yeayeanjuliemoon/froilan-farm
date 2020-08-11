package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class TuesdayRoutine implements WeekdayRoutine {

    public void doRoutine(Farm farm, Farmer farmer) {
        if (farmer.getName().equals("Froilan")) {
            Tractor tractor = (Tractor) farm.getFarmVehicles().get(0);
            Field field = farm.getCompleteField();
            List<CropRow> cropRows = field.getField();
            for (CropRow row : cropRows) {
                List<Crop> crops = row.getCropList();
                for (Crop crop : crops) {
                    farm.getEdibleInventory().addToContainer(tractor.harvest(crop));
                }
            }
        }
    }

}
