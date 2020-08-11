package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Field {

    List<CropRow> cropRowList;
    boolean hasBeenFertilized = false;


    Field(){
        cropRowList = new ArrayList<CropRow>();
    }

    public void setField(Crop cropType) {
        CropRow row = new CropRow();
        row.addCropRow(cropType);
        cropRowList.add(row);
    }

    public List<CropRow> getField() {
        return cropRowList;
    }

    public CropRow getCropRow(Integer index) {
        return cropRowList.get(index);
    }

    public void resetFertilizer(){
        this.hasBeenFertilized = false;
        for(CropRow row : this.cropRowList){
            for(Crop c : row.getCropList()){
                c.resetFertilizer();
            }
        }
    }
}
