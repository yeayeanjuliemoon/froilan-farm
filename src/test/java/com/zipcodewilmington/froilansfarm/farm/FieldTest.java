package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    private Field field;
    private CornStalk stalk;
    private TomatoPlant tomatoPlant;

    @BeforeEach
    void setUp(){
        this.stalk = new CornStalk();
        this.tomatoPlant = new TomatoPlant();
        this.field = new Field();

    }

    @Test
    void setFieldTest() throws InstantiationException, IllegalAccessException {
        Integer expected = 1;
        this.field.setField(this.stalk);

        Integer actual = this.field.getField().size();

        assertEquals(expected, actual);
    }

    @Test
    void setFieldTestType() throws InstantiationException, IllegalAccessException {
        this.field.setField(this.stalk);

        Crop result = this.field.getField().get(0).getCropList().get(0);

        assertTrue(result instanceof CornStalk);
    }


    @Test
    void resetFertilizerTest(){
        field.resetFertilizer();
        Assert.assertFalse(field.hasBeenFertilized);
    }

    @Test
    void resetFertilizerTestIfCropYields(){
        this.field.setField(this.stalk);
        field.resetFertilizer();

        Edible result = this.field.getCropRow(0).getCropList().get(0).yield();

        assertNull(result);
    }


}