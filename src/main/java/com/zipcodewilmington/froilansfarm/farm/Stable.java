package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stable extends Shelter {
    List<Horse> stable;
    Horse horse;

    public Stable() {
        stable = new ArrayList<Horse>();
    }

    public List<Horse> getStable(Integer numOfHorsesInStable){
        for(int i=0;i<numOfHorsesInStable;i++){
            stable.add(new Horse(i,"Horse"+i));
        }
        return stable;
    }

}
