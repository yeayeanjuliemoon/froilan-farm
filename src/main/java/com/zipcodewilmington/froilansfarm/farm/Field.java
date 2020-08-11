package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Field {

    List<CropRow> cropRowList;
    boolean hasBeenFertilized = false;


    Field(){
        cropRowList = new ArrayList<CropRow>();
    }

    public void setField(Crop cropType){
        cropRowList.add(new CropRow());
    }

    public List<CropRow> getField() {
        return cropRowList;
    }

    public CropRow getCropRow(Integer index) {
        return cropRowList.get(index);
    }

    public void setCropRowList(List<CropRow> cropRowList) {
        this.cropRowList = cropRowList;
    }

    public void resetFertilizer(){
        hasBeenFertilized = false;
    }
}
