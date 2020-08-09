package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements Eater,NoiseMaker{
    Integer id;
    String type;

    Animal(Integer id,String type){
        this.id = id;
        this.type = type;
    }

    public void eat(Edible toEat) {

    }

    public String makeNoise() {
        return null;
    }
}
