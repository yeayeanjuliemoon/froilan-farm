package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.Edible;
import com.zipcodewilmington.froilansfarm.farm.Inventory;

public interface Eater {

    boolean eat(Edible toEat, Inventory foodSource);
}
