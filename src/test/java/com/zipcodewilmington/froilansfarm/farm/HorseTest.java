package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
    Horse horse;
    private Inventory inv = new Inventory();

    @BeforeEach
    void setUp(){
        horse = new Horse(1,"Pony_1");

    }

    @Test
    void makeNoiseTest() {
      String actual = horse.makeNoise();
        Assert.assertEquals("HaHaHa",actual);
    }

    @Test
    void instanceOf(){
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    void testFeedHorseSuccess(){
        inv.addMultiple(new EarCorn(), 10);

        boolean result = this.horse.feedHorse(this.inv);

        assertTrue(result);
    }

    @Test
    void testFeedHorseFailure(){
        inv.addMultiple(new EarCorn(), 2);

        boolean result = this.horse.feedHorse(this.inv);

        assertFalse(result);
    }
}