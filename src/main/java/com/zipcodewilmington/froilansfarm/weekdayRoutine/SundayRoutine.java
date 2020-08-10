package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

import java.util.List;

public class SundayRoutine implements WeekdayRoutine {

    private Farm farm;
    private Farmers farmers = Farmers.getInstance();
    private Object EarCorn;

    public void doRoutine(Farm farm, Farmer farmer) {
        farmerRoutine(farm, farmers.getFarmerList().get(0));
        pilotRoutine(farm, farmers.getFarmerList().get(1));
    }

    public void farmerRoutine(Farm farm, Farmer farmer) {
        farmer.eatBreakfast(farm.getEdibleInventory());
        for(Stable stable : farm.getStables()) {
            for(Horse horse : stable.getInhabitants()) {
                horse.ride();
                horse.feedHorse((Inventory) EarCorn);
            }
        }
        List<CropRow> cropRows = farm.getField().getField();
            for(int i = 1; i <= 100; i++) {
                farmer.plant(new CornStalk(), cropRows.get(0));
            }
            for(int i = 1; i <= 20; i++) {
                farmer.plant(new TomatoPlant(), cropRows.get(1));
            }
            for(int i = 1; i <= 40; i++) {
                farmer.plant(new WheatPlant(), cropRows.get(2));
            }

    }

    public void pilotRoutine(Farm farm, Farmer farmer) {
        farmer.eatBreakfast(farm.getEdibleInventory());
        for(Stable stable : farm.getStables()) {
            for(Horse horse : stable.getInhabitants()) {
                horse.ride();
                horse.feedHorse((Inventory) EarCorn);
            }
        }
    }
}
