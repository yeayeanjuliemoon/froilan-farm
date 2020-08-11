package com.zipcodewilmington.froilansfarm.farm;

public class CornStalk extends Crop {

    Edible earCorn;

    public CornStalk(){

    }

    @Override
    public Edible yield() {
        if(hasBeenFertilized) {
            earCorn = new EarCorn();
            return earCorn;
        } else{
            return null;
        }
    }

    Boolean fertilize(){
        return hasBeenFertilized = true;

    }
}
