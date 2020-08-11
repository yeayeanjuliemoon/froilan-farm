package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class FridayRoutineTest {

    @Test
    public void testDoRoutine() {
        FridayRoutine fridayRoutine = new FridayRoutine();
        Farmer farmer = new Farmer("Froilan", 1);
        Farm farm = new Farm();

        farm.getEdibleInventory().addMultiple(new Wheat(), 10);
        fridayRoutine.doRoutine(farm, farmer);

        Integer expected = 10;
        Integer actual = farm.getEdibleInventory().getCount(new EarCorn());

        Assert.assertEquals(expected, actual);

    }

}
