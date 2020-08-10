package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    }
}