package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EggTest {

    Edible egg;
    Edible tomato;
    Edible earCorn;

    @BeforeEach
    void setUp(){
        egg = new Egg();
        tomato = new Tomato();
        earCorn = new EarCorn();
    }

    @Test
    void instanceOfTest(){
        Assert.assertTrue(egg instanceof Egg);
        Assert.assertTrue(tomato instanceof Tomato);
        Assert.assertTrue(earCorn instanceof EarCorn);
    }

}