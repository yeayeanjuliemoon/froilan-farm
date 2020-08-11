package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    Boolean hasBeenFertilized = false;
    Boolean hasBeenHarvested = false;
    Edible edible;

    Boolean fertilize(){
        return hasBeenFertilized = true;

    }

    void resetFertilizer(){
        this.hasBeenFertilized = false;
    }

}
