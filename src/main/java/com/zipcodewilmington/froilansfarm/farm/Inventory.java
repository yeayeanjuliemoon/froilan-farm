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

    public void addMultiple(Edible edible, Integer num){
        if(!container.containsKey(edible)) {
            container.put(edible, num);
        } else {
            container.put(edible, container.get(edible) + num);
        }
    }

    public Map<Edible, Integer> getContainer() {
        return this.container;
    }

    public boolean removeFromContainer(Edible edible) {
        if(container.containsKey(edible) && container.get(edible) > 0) {
            container.put(edible, container.get(edible) - 1);
            return true;
        }
        else{
            return false;
        }
    }

    public Integer getCount(Edible edible){
        return this.container.get(edible);
    }

    public boolean removeMultiple(Edible edible, Integer num){
        if(container.containsKey(edible)){
            if(getCount(edible) >= num){
                container.replace(edible, container.get(edible) - num);
                return true;
            }
        }
        return false;
    }
}
