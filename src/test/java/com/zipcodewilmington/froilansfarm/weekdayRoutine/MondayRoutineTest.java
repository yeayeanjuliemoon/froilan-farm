package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MondayRoutineTest {
    MondayRoutine monRoutine;
    Farm farm;
    Farmer farmer1;
    Farmer farmer2;

    @BeforeEach
    public void setUp(){

       farm = new Farm();
       farmer1 = new Farmer("Froilan", 1);
       farmer2 = new Farmer("Froilanda",2);
    }


    @Test
    void pilotRoutine()
    {
        Weekdays.MONDAY.getRoutine().doRoutine(farm,farmer2);
    }
}