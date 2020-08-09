package com.zipcodewilmington.froilansfarm.farm;

public class Tomato extends Edible {

    Tomato(){

    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass();
    }

}
