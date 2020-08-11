package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;


public class ThursdayRoutine implements WeekdayRoutine {

    public void doRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilan")){
            for(int i = 3; i < 5; i++) {
                List<CropRow> cropRows = farm.getCompleteField().getField();
                for(int j = 0; j < 20; j++) {
                    farmer.plant(new CornStalk(), cropRows.get(i));
                }
            }
        }
    }
}
