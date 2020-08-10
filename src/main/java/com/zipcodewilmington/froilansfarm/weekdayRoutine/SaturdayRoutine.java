package com.zipcodewilmington.froilansfarm.weekdayRoutine;

import com.zipcodewilmington.froilansfarm.farm.*;

public class SaturdayRoutine implements WeekdayRoutine {

    private Farm farm;
    private Farmers farmers = Farmers.getInstance();
    private Object EarCorn;

    public void doRoutine(Farm farm, Farmer farmer) {
        farmerRoutine(farm, farmers.getFarmerList().get(0));
        pilotRoutine(farm, farmers.getFarmerList().get(1));
        Chicken chicken = new Chicken(2, "Chicken");
        chicken.setHasBeenFertilized(true);

    }

    public void farmerRoutine(Farm farm, Farmer farmer) {
        farmer.eatBreakfast(farm.getEdibleInventory());
        for(Stable stable : farm.getStables()) {
            for(Horse horse : stable.getInhabitants()) {
                horse.ride();
                horse.feedHorse((Inventory) EarCorn);
            }
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
