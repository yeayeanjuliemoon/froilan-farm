package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StableTest {

    private Stable stable;

    StableTest(){
        this.stable = new Stable();
    }

    @Test
    void testMakeChickens() {
        Integer expected = 15;
        this.stable.addHorses(expected);

        Integer actual = this.stable.getInhabitants().size();

        assertEquals(expected, actual);
    }

    @Test
    void instanceOf(){

        Assert.assertTrue(stable != null);
    }

    @Test
    void getHorsesTest(){
        List<Horse> expected = new ArrayList<>();
        stable.addHorses(4);
        expected = stable.getHorses();
        Assert.assertTrue(expected.size()>0);
    }

}