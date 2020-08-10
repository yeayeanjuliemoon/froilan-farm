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
        this.farm.setUpFarmHouse();
        Integer expected = 2;

        Integer actual = this.farm.getFarmHouse().getInhabitants().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testFarmHouseSetupPeople(){
        this.farm.setUpFarmHouse();
        List<Farmer> expected = Farmers.getInstance().getFarmerList();

        List<Person> actual = this.farm.getFarmHouse().getInhabitants();

        assertEquals(expected, actual);
    }

    @Test
    public void testCoopSetup(){
        this.farm.setUpCoops(15);
        Integer expected = 4;

        Integer actual = this.farm.getCoops().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testStableSetup(){
        this.farm.setUpStables(10);
        Integer expected = 3;

        Integer actual = this.farm.getStables().size();

        assertEquals(expected, actual);
    }
}
