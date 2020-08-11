package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MondayRoutineTest {
    MondayRoutine monRoutine;
    Farm farm;
    Farmer farmer1;
    Farmer farmer2;
    private Aircraft cropDuster;

    @BeforeEach
    public void setUp(){
        cropDuster = new CropDuster();
       farm = new Farm();
       farmer1 = new Farmer("Froilan", 1);
       farmer2 = new Farmer("Froilanda",2);
    }
    
    @Test
    void pilotRoutine()
    {
        Weekdays.MONDAY.getRoutine().doRoutine(farm,farmer2);
        Assert.assertEquals("Hiss", farm.getAircraft().makeNoise());
    }
}