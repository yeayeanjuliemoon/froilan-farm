package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import javax.net.ssl.HostnameVerifier;

public class Horse extends Animal implements Rideable {
    Boolean hasBeenRidden = false;
    Edible toEat;
    Integer id;
    String name;

    Horse(Integer id,String name){
        super(id,name);
    }

    public String makeNoise() {
        return "HaHaHa";
    }

    public void ride() {
        //Boolean hasBeenRidden = true;
        return;
    }

    public boolean feedHorse(Inventory foodSource){
        EarCorn corn = new EarCorn();
        return eat(corn, foodSource) && eat(corn, foodSource) && eat(corn, foodSource);
    }

    @Override
    public boolean eat(Edible toEat, Inventory foodSource) {
        return foodSource.removeFromContainer(toEat);
    }
}
