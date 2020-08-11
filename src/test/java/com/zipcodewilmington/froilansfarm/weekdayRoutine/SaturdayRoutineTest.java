package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Chicken;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SaturdayRoutineTest {

    @Test
    public void testDoRoutine() {
        SaturdayRoutine saturdayRoutine = new SaturdayRoutine();
        Farmer farmer = new Farmer("Froilan", 1);
        Farm farm = new Farm();

        saturdayRoutine.doRoutine(farm, farmer);
        List<ChickenCoop> chickenCoops = farm.getCoops();

        for(int i = 0; i < chickenCoops.size(); i++) {
            List<Chicken> chickens = chickenCoops.get(i).getInhabitants();
            for(int j = 0; j < chickens.size(); j++) {
                Assert.assertTrue(chickens.get(j).getHasBeenFertilized());
            }
        }
    }
}
