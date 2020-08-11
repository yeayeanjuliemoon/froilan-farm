package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class SundayRoutine implements WeekdayRoutine {

    public void doRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilan")) {
            List<CropRow> cropRows = farm.getCompleteField().getField();
            for (int i = 1; i <= 100; i++) {
                farmer.plant(new CornStalk(), cropRows.get(0));
            }
            for (int i = 1; i <= 20; i++) {
                farmer.plant(new TomatoPlant(), cropRows.get(1));
            }
            for (int i = 1; i <= 40; i++) {
                farmer.plant(new WheatPlant(), cropRows.get(2));
            }
        }
    }
}
