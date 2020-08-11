package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {
    private ChickenCoop chickenCoop;

    ChickenCoopTest(){
        this.chickenCoop = new ChickenCoop();
    }

    @Test
    void testMakeChickens() {
        Integer expected = 15;
        this.chickenCoop.addChickens(expected);

        Integer actual = this.chickenCoop.getInhabitants().size();

        assertEquals(expected, actual);
    }

    @Test
    void instanceOf(){

        Assert.assertTrue(chickenCoop != null);
    }
}