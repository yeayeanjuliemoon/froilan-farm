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
    public void eat(Edible toEat) {
        this.toEat = toEat;
    }

    public String makeNoise() {
        return "HaHaHa";
    }

    public void ride() {
        Boolean hasBeenRidden = true;
    }
}
