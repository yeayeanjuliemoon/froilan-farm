package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void testMakeNoise() {
        CropDuster cropDuster = new CropDuster();

        String expected = "Hiss";
        String actual = cropDuster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFertilize() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();

        cropDuster.fertilize(cropRow);

        boolean actual = cropRow.hasBeenFertilized;

        Assert.assertTrue(actual);
    }
}
