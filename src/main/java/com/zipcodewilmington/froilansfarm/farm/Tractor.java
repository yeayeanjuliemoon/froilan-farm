package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.HashMap;

public class Tractor extends Vehicle implements FarmVehicle {
    private Inventory inventory;

    public Tractor() {
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void operate(Farm farm) {
    }

    public String makeNoise() {
        return "Vroom";
    }

    public void ride() {
    }

    public void harvest(Crop crop) {
        this.inventory.addToContainer(crop.yield());
    }
}
