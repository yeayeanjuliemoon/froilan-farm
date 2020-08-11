package com.zipcodewilmington.froilansfarm.farm;

public class CornStalk extends Crop {

    Edible earCorn;

    public CornStalk(){

    }

    @Override
    public Edible yield() {
        earCorn = new EarCorn();
        return earCorn;
    }

    Boolean fertilize(){
        hasBeenFertilized = true;
        return hasBeenFertilized;

    }
}
