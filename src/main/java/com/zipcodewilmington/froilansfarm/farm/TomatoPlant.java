package com.zipcodewilmington.froilansfarm.farm;

public class TomatoPlant extends Crop {
    Edible tomato;

    public TomatoPlant(){

    }

    @Override
    public Edible yield() {
        if(hasBeenFertilized) {
            tomato = new Tomato();
            return tomato;
        } else{
            return null;
        }
    }

    Boolean fertilize(){
        return hasBeenFertilized = true;
    }

}
