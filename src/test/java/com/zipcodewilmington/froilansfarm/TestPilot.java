package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestPilot {

    private Pilot pilot = new Pilot("Froilanda", 2);
    private Inventory newInventory = new Inventory();

    @Test
    public void testPilot(){
        assertTrue(this.pilot instanceof Farmer);
    }

    @org.junit.Test
    public void testEatSuccess(){
        this.newInventory.addMultiple(new EarCorn(), 10);
        this.newInventory.addMultiple(new Tomato(), 10);
        this.newInventory.addMultiple(new Egg(), 10);

        assertTrue(this.pilot.eatBreakfast(this.newInventory));
    }

    @org.junit.Test
    public void testEatFailure(){
        this.newInventory.addMultiple(new EarCorn(), 1);
        this.newInventory.addMultiple(new Tomato(), 2);
        this.newInventory.addMultiple(new Egg(), 1);

        assertFalse(this.pilot.eatBreakfast(this.newInventory));
    }

    @org.junit.Test
    public void testEatCount(){
        Integer expectedCorn = 8;
        Integer expectedTomato = 9;
        Integer expectedEgg = 8;
        this.newInventory.addMultiple(new EarCorn(), 10);
        this.newInventory.addMultiple(new Tomato(), 10);
        this.newInventory.addMultiple(new Egg(), 10);

        this.pilot.eatBreakfast(this.newInventory);

        assertEquals(expectedCorn, this.newInventory.getCount(new EarCorn()));
        assertEquals(expectedTomato, this.newInventory.getCount(new Tomato()));
        assertEquals(expectedEgg, this.newInventory.getCount(new Egg()));
    }
}
