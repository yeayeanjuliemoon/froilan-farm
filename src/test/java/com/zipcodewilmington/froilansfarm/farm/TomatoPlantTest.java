package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoPlantTest {
    TomatoPlant tomatoPlant;
    Edible tomato;

    @BeforeEach
     void setUp(){
        tomatoPlant = new TomatoPlant();
    }

    @Test
    void yield(){
        tomato = tomatoPlant.yield();
        Assert.assertTrue(tomato instanceof Tomato);

    }


}