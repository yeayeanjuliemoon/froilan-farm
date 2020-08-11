package com.zipcodewilmington.froilansfarm.farm;

public class EarCorn extends Edible {

    public EarCorn(){

    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass();
    }
}
