package com.zipcodewilmington.froilansfarm.farm;

public class CornStalk extends Crop {
    Edible earCorn;

    CornStalk(){
    }

    public Edible yield() {
        earCorn = new EarCorn();
        return earCorn;
    }

    Boolean fertilize(){
        return hasBeenFertilized = true;

    }
}
