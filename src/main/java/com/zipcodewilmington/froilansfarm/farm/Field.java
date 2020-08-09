package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Field {

    List<CropRow> cropRowList;
    boolean hasBeenFertilized = false;
    CropRow cropRow;

    Field(){
        cropRowList = new ArrayList<CropRow>();
        cropRow = new CropRow();
    }

    public void setField(Crop cropType){
        cropRow.addCropRow(cropType);
        cropRowList.addAll(cropRow.getCropList());
    }

    public List<CropRow> getField() {
        return cropRowList;
    }

    public void setCropRowList(List<CropRow> cropRowList) {
        this.cropRowList = cropRowList;
    }

    void fertilizeField(){
        hasBeenFertilized = true;
    }

    void resetFertilizer(){
        hasBeenFertilized = false;
    }
}
