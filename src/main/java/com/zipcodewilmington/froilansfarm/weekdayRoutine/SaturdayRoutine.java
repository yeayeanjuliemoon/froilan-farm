package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

public class SaturdayRoutine implements WeekdayRoutine {


    public void doRoutine(Farm farm, Farmer farmer) {
        for(ChickenCoop coop : farm.getCoops()){
            for(Chicken c : coop.getInhabitants()){
                c.setHasBeenFertilized(true);
            }
        }
    }
}
