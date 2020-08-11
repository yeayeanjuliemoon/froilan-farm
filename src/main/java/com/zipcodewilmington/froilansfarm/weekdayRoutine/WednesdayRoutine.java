package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class WednesdayRoutine implements WeekdayRoutine{
    Inventory inv = new Inventory();

    public void doRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilan")){
            for(ChickenCoop coop : farm.getCoops()){
                for(Chicken c : coop.getInhabitants()){
                    farm.getEdibleInventory().addToContainer(c.yield());
                }
            }
        }
    }
}
