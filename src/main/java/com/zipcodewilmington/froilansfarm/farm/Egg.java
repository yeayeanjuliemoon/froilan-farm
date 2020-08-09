package com.zipcodewilmington.froilansfarm.farm;

public class Egg extends Edible{
    Egg egg;

    Egg(){

    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass();
    }
}
