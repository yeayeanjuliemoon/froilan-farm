package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public interface Botanist {

    Crop plant(Crop c, CropRow row);
}
