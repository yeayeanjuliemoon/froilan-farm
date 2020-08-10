package com.zipcodewilmington.froilansfarm.farm;

public class Wheat extends Edible {

    public Wheat(){

    }

    @Override
    public int hashCode() {
        return 8;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass();
    }
}
