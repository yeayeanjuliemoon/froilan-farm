package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name, Integer id) {
        super(name, id);
    }

    public Crop plant(Crop c, CropRow row) {
        return null;
    }



    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {
        rideable.ride();
    }

    public void dismount(Rideable rideable) {

    }

    public void eat(Edible toEat, Inventory foodSource) {

    }
}
