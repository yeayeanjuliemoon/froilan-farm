package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name, Integer id) {
        super(name, id);
    }

    public void plant(Crop c, CropRow row) {
        row.addCropRow(c);
    }



    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {
        rideable.ride();
    }

    public void dismount(Rideable rideable) {

    }

    public void trade(Edible edible, Inventory inventory) {
        if(edible instanceof Wheat) {
            inventory.removeMultiple(edible, inventory.getCount(edible) / 2);
            EarCorn earCorn = new EarCorn();
            Wheat wheat = new Wheat();
            inventory.addMultiple(earCorn, 2 * (inventory.getCount(edible) / 2));
        }
    }

    public boolean eatBreakfast(Inventory foodSource){
        // 1 Earcorn, 2 Tomato, 5 Egg
        boolean hasEaten = this.eat(new EarCorn(), foodSource);
        for(int i = 0; i < 5; i++){
            if(i < 2){
                hasEaten = hasEaten && this.eat(new Tomato(), foodSource);
            }
            hasEaten = hasEaten && this.eat(new Egg(), foodSource);
        }
        return hasEaten;
    }

    public boolean eat(Edible toEat, Inventory foodSource) {
        // 1 Earcorn, 2 Tomato, 5 Egg
        return foodSource.removeFromContainer(toEat);
    }
}
