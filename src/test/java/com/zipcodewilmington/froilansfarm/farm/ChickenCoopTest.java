package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {
    ChickenCoop chickenCoop;
    List<Chicken> actualCoop;

    ChickenCoopTest(){
        chickenCoop = new ChickenCoop();
    }

    @Test
    void getChickenCoopList() {

        actualCoop = chickenCoop.getChickenCoopList(Integer.valueOf(3));
        Assert.assertNotNull(actualCoop);
        Assert.assertTrue(actualCoop.size()==3);
    }

    @Test
    void instanceOf(){

        Assert.assertTrue(chickenCoop instanceof Shelter);
    }
}