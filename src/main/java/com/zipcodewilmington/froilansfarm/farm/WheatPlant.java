package com.zipcodewilmington.froilansfarm.farm;

public class WheatPlant extends Crop {

    Edible wheat;

    public WheatPlant() {

    }

    @Override
    public Edible yield() {
        wheat = new Wheat();
        return wheat;
    }

    Boolean fertilize(){
        return hasBeenFertilized = true;

    }
}
