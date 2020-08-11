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
        EarCorn earCorn = new EarCorn();

        Edible expected = earCorn;
        Edible actual = tractor.harvest(cornStalk);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHarvestTomatoPlant() {
        Tractor tractor = new Tractor();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Tomato tomato = new Tomato();

        Edible expected = tomato;
        Edible actual = tractor.harvest(tomatoPlant);

        Assert.assertEquals(expected, actual);
    }
}
