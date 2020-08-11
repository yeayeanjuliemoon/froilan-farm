package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

public class FridayRoutine implements WeekdayRoutine {



    public void doRoutine(Farm farm, Farmer farmer) {
        if(farmer.getName().equals("Froilan")){
            farmer.trade(new EarCorn(), farm.getEdibleInventory());
        }
    }
}
