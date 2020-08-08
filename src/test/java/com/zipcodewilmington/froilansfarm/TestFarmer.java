package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.Farmer;
import com.zipcodewilmington.froilansfarm.farm.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFarmer {
    private Farmer newFarmer;

    @Before
    public void setUp(){
        this.newFarmer = new Farmer("Frank", 12);
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

}
