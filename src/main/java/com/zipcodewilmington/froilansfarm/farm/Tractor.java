package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {
    private Inventory inventory;
    private Edible edible;

    public void operate(Farm farm) {

    }

    public String makeNoise() {
        return null;
    }

    public void ride() {

    }

    public void harvest(Crop crop) {
        this.inventory.addToInventory(edible);
    }
}
