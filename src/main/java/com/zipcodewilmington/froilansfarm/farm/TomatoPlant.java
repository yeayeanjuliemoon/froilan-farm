package com.zipcodewilmington.froilansfarm.farm;

public class TomatoPlant extends Crop {
    Edible tomato;

    public TomatoPlant(){

    }

    @Override
    public Edible yield() {
         tomato = new Tomato();
         return tomato;
    }

    Boolean fertilize(){
        return hasBeenFertilized = true;

    }

}
