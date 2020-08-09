package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {
    protected String name;
    protected Integer id;
    protected boolean hasEaten;

    public Person(String name, Integer id){
        this.name = name;
        this.id = id;
        this.hasEaten = false;
    }

    public String getName(){
        return this.name;
    }

    public Integer getId() {
        return id;
    }


}
