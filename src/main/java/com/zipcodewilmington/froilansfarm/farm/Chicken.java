package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    Edible toEat;
    Edible egg;
    Boolean hasBeenFertilized = false;
    Integer id;
    String type;

    Chicken(Integer id, String name){
        super(id,name);
    }

    public void eat(Edible toEat) {
        this.toEat = toEat;
    }

    public String makeNoise() {
        return "ChickChick";
    }

    public Edible yield() {

        if(hasBeenFertilized==false){
            return egg;
        }

        return null;
    }
}
