package com.zipcodewilmington.froilansfarm.farm;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class TestFarm {
    private Farm farm;

    @Before
    public void SetUp(){
        this.farm = new Farm();
    }

    @Test
    public void testFarmHouseSetupCount(){
        Integer expected = 2;

        Integer actual = this.farm.getFarmHouse().getInhabitants().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testFarmHouseSetupPeople(){
        List<Farmer> expected = Farmers.getInstance().getFarmerList();

        List<Person> actual = this.farm.getFarmHouse().getInhabitants();

        assertEquals(expected, actual);
    }

    @Test
    public void testCoopSetup(){
        Integer expected = 4;

        Integer actual = this.farm.getCoops().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testStableSetup(){
        Integer expected = 3;

        Integer actual = this.farm.getStables().size();

        assertEquals(expected, actual);
    }

    
}
