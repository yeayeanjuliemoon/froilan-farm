package com.zipcodewilmington.froilansfarm.farm;

public class WheatPlant extends Crop {

    Edible wheat;

    public WheatPlant() {

    }

    @Override
    public Edible yield() {
        if(hasBeenFertilized) {
            wheat = new Wheat();
            return wheat;
        } else{
            return null;
        }
    }

    Boolean fertilize(){
        return hasBeenFertilized = true;

    }
}
