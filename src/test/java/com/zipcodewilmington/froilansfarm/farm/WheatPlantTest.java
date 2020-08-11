package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class WheatPlantTest {
    WheatPlant wheatPlant;
    Edible wheat;

    @Before
    void setUp(){
        wheatPlant = new WheatPlant();

    }

    @Test
    void yieldTest(){
        wheatPlant = new WheatPlant();
        wheat = wheatPlant.yield();
        Assert.assertTrue(wheat instanceof Wheat);
    }

}
