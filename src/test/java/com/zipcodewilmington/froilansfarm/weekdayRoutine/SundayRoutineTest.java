package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import sun.security.provider.Sun;

public class SundayRoutineTest {

    @Test
    public void testDoRoutine() {
        SundayRoutine sundayRoutine = new SundayRoutine();
        Farmer farmer = new Farmer("Froilan", 1);
        Farm farm = new Farm();

        sundayRoutine.doRoutine(farm, farmer);

        Integer expectedCornStalk = 101;
        Integer actualCornStalk = farm.getCompleteField()
                .getField()
                .get(0)
                .getCropList()
                .size();

        Assert.assertEquals(expectedCornStalk, actualCornStalk);

        Integer expectedTomatoPlant = 21;
        Integer actualTomatoPlant = farm.getCompleteField()
                .getField()
                .get(1)
                .getCropList()
                .size();

        Assert.assertEquals(expectedTomatoPlant, actualTomatoPlant);

        Integer expectedWheatPlant = 41;
        Integer actualWheatPlant = farm.getCompleteField()
                .getField()
                .get(2)
                .getCropList()
                .size();

        Assert.assertEquals(expectedWheatPlant, actualWheatPlant);
    }
}
