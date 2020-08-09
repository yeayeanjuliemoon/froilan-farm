package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CornStalkTest {

    CornStalk cornStalk;
    Edible earCorn;

    @Before
    void setUp(){
        cornStalk = new CornStalk();

    }

    @Test
    void yieldTest(){
        cornStalk = new CornStalk();
        earCorn = cornStalk.yield();
        Assert.assertTrue(earCorn instanceof EarCorn);
    }

}