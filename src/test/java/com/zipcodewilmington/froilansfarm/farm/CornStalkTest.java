package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CornStalkTest {

    CornStalk cornStalk;
    Edible earCorn;

    @BeforeEach
    void setUp(){
        cornStalk = new CornStalk();
    }

    @Test
    void yieldTest(){
        cornStalk = new CornStalk();
        cornStalk.fertilize();
        earCorn = cornStalk.yield();
        Assert.assertTrue(earCorn instanceof EarCorn);
    }

    @Test
    void fertilizeTest(){
        Assert.assertTrue(cornStalk.fertilize());
    }

}