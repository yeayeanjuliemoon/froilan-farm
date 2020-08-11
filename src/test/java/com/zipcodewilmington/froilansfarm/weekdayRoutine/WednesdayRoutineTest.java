package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Edible;
import com.zipcodewilmington.froilansfarm.farm.Egg;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.EditorKit;

import static org.junit.jupiter.api.Assertions.*;

class WednesdayRoutineTest {
    Farm farm;
    Farmer farmer1;
    Farmer farmer2;
    WednesdayRoutine wednesdayRoutine;

    @BeforeEach
    void setUp(){
        farm = new Farm();
        farmer1 = new Farmer("Froilan", 1);
        farmer2 = new Farmer("Froilanda",2);
        wednesdayRoutine = new WednesdayRoutine();
    }

    @Test
    void doRoutine() {
        wednesdayRoutine.doRoutine(farm,farmer1);
        Assert.assertEquals(4,farm.getCoops().size());
        Assert.assertEquals("ChickChick",farm.getCoops().get(0).getInhabitants().get(0).makeNoise());
    }
}