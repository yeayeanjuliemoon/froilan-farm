package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class ThursdayRoutineTest {

    @Test
    public void testDoRoutine() {
        ThursdayRoutine thursdayRoutine = new ThursdayRoutine();
        Farmer farmer = new Farmer("Froilan", 1);
        Farm farm = new Farm();

        thursdayRoutine.doRoutine(farm, farmer);

        Integer expected = 20;
        Integer actual = farm.getCompleteField()
                .getField()
                .get(5)
                .getCropList()
                .size();

        Assert.assertEquals(expected, actual);
    }


}
