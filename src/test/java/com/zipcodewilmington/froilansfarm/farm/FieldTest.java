package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    void getFieldTest(){
        field.setField(crop1);
        List<CropRow> fieldlist = field.getField();
        Assert.assertTrue(fieldlist.size()>0);
    }

    @Test
    void setCropRowTest(){
        List<CropRow> cropRowList = new ArrayList<>();
        CropRow cropRow = new CropRow();
        CropRow cropRow1 = new CropRow();
        cropRow.addCropRow(new TomatoPlant());
        cropRow1.addCropRow(new CornStalk());
        cropRowList.add(cropRow);
        cropRowList.add(cropRow1);
        field.setCropRowList(cropRowList);
        Assert.assertEquals(cropRowList.size(), field.getField().size());
        Assert.assertNotNull(field.getCropRow(1));

    }

    @Test
    void resetFertilizerTest(){
        field.resetFertilizer();
        Assert.assertFalse(field.hasBeenFertilized==true);
    }



}