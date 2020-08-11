package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;


public class ThursdayRoutine implements WeekdayRoutine {

    private Farm farm;
    private Farmers farmers = Farmers.getInstance();
    private Object EarCorn;

    public void doRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilan")){
            for(int i = 4; i < 6; i++) {
                List<CropRow> cropRows = farm.getCompleteField().getField();
                farmer.plant(new CornStalk(), cropRows.get(i));
            }
        }
    }
}
