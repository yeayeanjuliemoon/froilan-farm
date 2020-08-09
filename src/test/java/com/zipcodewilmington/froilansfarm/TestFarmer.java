package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFarmer {
    private Farmer newFarmer;
    private Inventory newInventory;

    @Before
    public void setUp(){
        this.newFarmer = new Farmer("Frank", 12);
        this.newInventory = new Inventory();

    }

    @Test
    public void testGetName(){
        String expected = "Frank";

        String actual = this.newFarmer.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetID(){
        Integer expected = 12;

        Integer actual = this.newFarmer.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testEatSuccess(){
        this.newInventory.addMultiple(new EarCorn(), 10);
        this.newInventory.addMultiple(new Tomato(), 10);
        this.newInventory.addMultiple(new Egg(), 10);

        assertTrue(this.newFarmer.eatBreakfast(this.newInventory));
    }

    @Test
    public void testEatFailure(){
        this.newInventory.addMultiple(new EarCorn(), 10);
        this.newInventory.addMultiple(new Tomato(), 10);
        this.newInventory.addMultiple(new Egg(), 2);

        assertFalse(this.newFarmer.eatBreakfast(this.newInventory));
    }

    @Test
    public void testEatCount(){
        Integer expectedCorn = 9;
        Integer expectedTomato = 8;
        Integer expectedEgg = 5;
        this.newInventory.addMultiple(new EarCorn(), 10);
        this.newInventory.addMultiple(new Tomato(), 10);
        this.newInventory.addMultiple(new Egg(), 10);

        this.newFarmer.eatBreakfast(this.newInventory);

        assertEquals(expectedCorn, this.newInventory.getCount(new EarCorn()));
        assertEquals(expectedTomato, this.newInventory.getCount(new Tomato()));
        assertEquals(expectedEgg, this.newInventory.getCount(new Egg()));
    }

}
