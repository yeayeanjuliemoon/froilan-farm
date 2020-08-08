package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.Farmer;
import com.zipcodewilmington.froilansfarm.farm.Farmers;
import com.zipcodewilmington.froilansfarm.farm.Pilot;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestFarmers {
    private Farmers farmers = Farmers.getInstance();
    private List<Farmer> farmersList = farmers.getFarmerList();

    @Test
    public void testFarmerNames(){
        String expected1 = "Froilan";
        String expected2 = "Froilanda";

        String actual1 = farmersList.get(0).getName();
        String actual2 = farmersList.get(1).getName();

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testFarmerID(){
        Integer expected1 = 1;
        Integer expected2 = 2;

        Integer actual1 = farmersList.get(0).getId();
        Integer actual2 = farmersList.get(1).getId();

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testFroilandaPilot(){
        Farmer froilanda = this.farmersList.get(1);

        assertTrue(froilanda instanceof Pilot);
    }

    @Test
    public void testIfFarmersAreTheSame(){
        // Test to ensure that getting the farmer from two different calls of getInstance returns the same farmer object
        Farmers newFarmers = Farmers.getInstance();
        List<Farmer> newFarmerList = newFarmers.getFarmerList();
        Farmer froilanda1 = this.farmersList.get(1);
        Farmer froilanda2 = newFarmerList.get(1);

        assertEquals(froilanda1, froilanda2);
    }
}
