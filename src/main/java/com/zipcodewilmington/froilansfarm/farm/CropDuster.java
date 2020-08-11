package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {

    @Override
    public void fly(Farm farm){
        this.operate(farm);
    }

    public void operate(Farm farm) {
        for(CropRow row : farm.getField().getField()){
            fertilize(row);
        }
    }

    public String makeNoise() {
        return "Hiss";
    }

    public void ride() {

    }

    public void fertilize(CropRow row) {
        row.fertilizeRow();
    }
}
