package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    Field field;
    Crop crop1;
    Crop crop2;

    @BeforeEach
    void setUp(){
        crop1 = new CornStalk();
        crop2 = new TomatoPlant();
        field = new Field();

    }

    @Test
    void setFieldTest() {
        field.setField(crop1);
        field.setField(crop2);
        Assert.assertNotNull(field.getField());
    }

    @Test
    void fertilizeFieldTest() {
        field.fertilizeField();
        Assert.assertTrue(field.hasBeenFertilized==true);
    }

    @Test
    void resetFertilizerTest(){
        field.resetFertilizer();
        Assert.assertFalse(field.hasBeenFertilized==true);
    }

}