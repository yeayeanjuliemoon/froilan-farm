package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChickenCoop extends Shelter<Integer, Chicken> {
    private int numInhabitants = 0;

    ChickenCoop(){
        super();
    }

    public void addChickens(Integer numChickens){
        for(int i = 0; i < numChickens; i++){
            super.add(i + this.numInhabitants, new Chicken(i + this.numInhabitants, "Chicken Little"));
            this.numInhabitants++;
        }
    }

}
