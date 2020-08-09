package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.weekdayRoutine.Weekdays;

import java.util.List;

public class Farm {
    private FarmHouse farmHouse;
    private List<Stable> stables;
    private List<ChickenCoop> coops;
    private Field field;
    private List<FarmVehicle> farmVehicles;
    private Aircraft aircraft;
    private Weekdays currentDay;
    private Inventory edibleInventory;

    public Farm(){

    }

    private void setUpFarm(){
        /* A farm has:
        2 people (Froilan and Froilanda)
        1 Field with 5 Crop Row
        15 Chicken in 4 ChickenCoop
        10 Horse in 3 Stable
        2 FarmVehicle
        1 Aircraft
         */

    }
}
