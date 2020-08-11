package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    Edible toEat;
    Edible egg;
    Boolean hasBeenFertilized = false;
    Integer id;
    String type;

    public Chicken(Integer id, String name){
        super(id,name);
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

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean getHasBeenFertilized() {
        return this.hasBeenFertilized;
    }


    @Override
    public boolean eat(Edible toEat, Inventory foodSource) {
        return foodSource.removeFromContainer(toEat);
    }
}
