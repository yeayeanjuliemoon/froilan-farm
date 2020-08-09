package com.zipcodewilmington.froilansfarm.farm;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<Edible, Integer> container = new HashMap<>();

    public void addToContainer(Edible edible) {
        if(!container.containsKey(edible)) {
            container.put(edible, 1);
        } else {
            container.put(edible, container.get(edible) + 1);
        }
    }

    public Map<Edible, Integer> getContainer() {
        return this.container;
    }

    public void removeFromContainer(Edible edible) {
        if(container.containsKey(edible)) {
            container.put(edible, container.get(edible) - 1);
        }
    }
}
