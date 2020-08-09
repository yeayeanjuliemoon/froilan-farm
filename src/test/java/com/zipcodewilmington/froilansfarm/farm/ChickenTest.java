package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

   Chicken chicken;
   private Inventory inv = new Inventory();

    @BeforeEach
    void setUp(){
        chicken = new Chicken(1,"Chicken_1");
    }

    @Test
    void makeNoiseTest() {
        String actual = chicken.makeNoise();
        Assert.assertEquals("ChickChick",actual);
    }

    @Test
    void instanceOf(){
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Ignore
    void yield() {

        Assert.assertNotNull(chicken.yield());
    }

    @Test
    void testEatSuccess(){
        inv.addToContainer(new EarCorn());

        assertTrue(chicken.eat(new EarCorn(), this.inv));
    }

    @Test
    void testEatFailure(){

        assertFalse(chicken.eat(new EarCorn(), this.inv));
    }
}