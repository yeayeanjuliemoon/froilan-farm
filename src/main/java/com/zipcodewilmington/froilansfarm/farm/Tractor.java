package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.HashMap;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor() {
    }


    public void operate(Farm farm) {
    }

    public String makeNoise() {
        return "Vroom";
    }

    public void ride() {
    }

    public Edible harvest(Crop crop) {
        return crop.yield();
    }
}
