package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
    Horse horse;

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
}