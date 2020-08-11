package com.zipcodewilmington.froilansfarm.farm;

public class Pilot extends Farmer {

    public Pilot(String name, Integer id) {
        super(name, id);
    }

    public void flyAircraft(Aircraft aircraft){

    }


    @Override
    public boolean eatBreakfast(Inventory foodSource){
        // 1 Tomato, 2 Earcorn, 2 Egg
        boolean hasEaten = this.eat(new Tomato(), foodSource);
        for(int i = 0; i < 2; i++){
            hasEaten = hasEaten && this.eat(new EarCorn(), foodSource);
            hasEaten = hasEaten && this.eat(new Egg(), foodSource);
        }
        return hasEaten;
    }
}
