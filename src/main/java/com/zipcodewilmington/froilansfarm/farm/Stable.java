package com.zipcodewilmington.froilansfarm.farm;

public class Stable extends Shelter<Integer, Horse> {
    private int numInhabitants = 0;

    public Stable() {
        super();
    }

    public void addHorses(Integer numHorse){
        for(int i = 0; i < numHorse; i++){
            super.add(i + this.numInhabitants, new Horse(i + this.numInhabitants, "Bojack"));
            this.numInhabitants++;
        }
    }

    public List<Horse> getHorses() {
        List<Horse> horses = new ArrayList<>();
        horses.addAll(super.getInhabitants());
        return horses;
    }

}
