package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Farmers {

    private static Farmers instance = new Farmers();
    private List<Farmer> farmerList;

    private Farmers(){
        this.farmerList = new ArrayList<Farmer>();
        this.farmerList.add(new Farmer("Froilan", 1));
        this.farmerList.add(new Pilot("Froilanda", 2));
    }

    public Farmers getInstance(){
        return this.instance;
    }

    public List<Farmer> getFarmerList(){
        return this.farmerList;
    }
}
