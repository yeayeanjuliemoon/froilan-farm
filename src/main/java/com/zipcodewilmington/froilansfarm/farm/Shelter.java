package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;

import java.util.HashMap;
import java.util.Map;

public abstract class Shelter<K, V extends Eater> {
    protected Map<K, V> inhabitants;

    public Shelter(){
        this.inhabitants = new HashMap<>();
    }

    public void add(K key, V value){
        this.inhabitants.put(key, value);
    }

}
