package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;

import org.junit.jupiter.api.Test;

import java.util.List;

class StableTest {

    Stable stable;
    List<Horse> actualStable;


    public StableTest(){
        stable = new Stable();
    }

    @Test
    public void getStableTest(){
        actualStable = stable.getStable(4);
        Assert.assertTrue(actualStable.size()==4);
        Assert.assertNotNull(actualStable);
    }

}