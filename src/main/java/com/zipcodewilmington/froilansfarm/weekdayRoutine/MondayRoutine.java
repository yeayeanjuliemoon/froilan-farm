package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class MondayRoutine implements WeekdayRoutine {


    public void doRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilanda")) {
            farm.getAircraft().fly(farm);
        }
    }
}
