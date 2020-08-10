package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stable extends Shelter<Integer, Horse> {
    private int numInhabitants = 0;

    public Stable() {
        super();
    }

    public void addHorses(Integer numHorse){
        for(int i = 0; i < numHorse; i++){
            super.add(i + this.numInhabitants, new Horse(i + this.numInhabitants, "Bojack"));
            this.numInhabitants++;
        }
    }

}
