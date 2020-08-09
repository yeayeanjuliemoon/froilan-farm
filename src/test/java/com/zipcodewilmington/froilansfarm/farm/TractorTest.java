package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TractorTest {

    @Test
    public void testMakeNoise() {
        Tractor tractor = new Tractor();

        String expected = "Vroom";
        String actual = tractor.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHarvestCornStalk() {
        Tractor tractor = new Tractor();
        CornStalk cornStalk = new CornStalk();

        tractor.harvest(cornStalk);

        Integer expected = 1;
        Integer actual = tractor.getInventory().getContainer().get(cornStalk.yield());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHarvestTomatoPlant() {
        Tractor tractor = new Tractor();
        TomatoPlant tomatoPlant = new TomatoPlant();

        tractor.harvest(tomatoPlant);

        Integer expected = 1;
        Integer actual = tractor.getInventory().getContainer().get(tomatoPlant.yield());

        Assert.assertEquals(expected, actual);
    }
}
