package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;
import com.zipcodewilmington.froilansfarm.farm.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuesdayRoutineTest {
    Farm farm;
    Farmer farmer1;
    Farmer farmer2;

    TuesdayRoutine tuesRoutine = new TuesdayRoutine();

    @BeforeEach
    void setUp() {
        farm = new Farm();
        farmer1 = new Farmer("Froilan", 1);
        farmer2 = new Farmer("Froilanda", 2);
    }

    @Test
    void doRoutine() {
        tuesRoutine.doRoutine(farm,farmer1);
        Field completeField = farm.getCompleteField();
        Assert.assertEquals(5, completeField.getField().size());
    }

}
