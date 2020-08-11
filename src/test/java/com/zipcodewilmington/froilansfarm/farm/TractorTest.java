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


}
