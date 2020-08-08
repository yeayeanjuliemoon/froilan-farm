package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {
    protected String name;
    protected Integer id;

    public Person(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getId() {
        return id;
    }


}
