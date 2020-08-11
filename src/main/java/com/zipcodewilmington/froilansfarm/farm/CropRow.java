package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

    Boolean hasBeenFertilized = false;
    List<Crop> cropList;

    CropRow(){
       cropList = new ArrayList<>();
    }

    public void addCropRow(Crop cropType){
        this.cropList.add(cropType);
    }

    public List<Crop> getCropList(){
        return cropList;
    }

    void fertilizeRow(){
        hasBeenFertilized = true;
    }

}
