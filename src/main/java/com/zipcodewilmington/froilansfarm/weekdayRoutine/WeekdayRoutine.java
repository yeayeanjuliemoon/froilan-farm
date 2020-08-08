package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Farmer;

public interface WeekdayRoutine {

    // Interface implemented by the different weekday routine classes

    void doRoutine(Farm farm, Farmer farmer);
    void farmerRoutine(Farm farm, Farmer farmer);
    void PilotRoutine(Farm farm, Farmer farmer);
}
