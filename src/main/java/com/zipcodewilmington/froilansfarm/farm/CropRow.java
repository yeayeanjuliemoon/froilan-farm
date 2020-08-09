package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class CropRow <T extends Crop> {

    Boolean hasBeenFertilized = false;
    List<Crop> cropList ;

    CropRow(){
       cropList = new ArrayList<Crop>();
    }

    public void addCropRow(Crop cropType){
        if (cropType instanceof TomatoPlant) {
            cropList.add(new TomatoPlant());
        }else if(cropType instanceof CornStalk){
            cropList.add(new CornStalk());
        }
    }

    public List<Crop> getCropList(){
        return cropList;
    }

    void fertilizeRow(){
        hasBeenFertilized = true;
    }

}
