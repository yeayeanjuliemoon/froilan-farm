package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChickenCoop extends Shelter {
    List<Chicken> chickenCoop;
    Chicken chicken;

    ChickenCoop(){
        chickenCoop = new ArrayList<Chicken>();
    }

    public List<Chicken> getChickenCoopList(Integer numOfChickensInCoop) {
        for(int i=0;i<numOfChickensInCoop;i++){
            chickenCoop.add(new Chicken(i,"Chicken"+i));
        }
        return chickenCoop;
    }

}
