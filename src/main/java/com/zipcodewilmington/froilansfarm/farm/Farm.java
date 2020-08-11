package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.weekdayRoutine.Weekdays;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final FarmHouse farmHouse;
    private final List<Stable> stables;
    private final List<ChickenCoop> coops;
    private final Field field;
    private final List<FarmVehicle> farmVehicles;
    private final Aircraft aircraft;
    private Weekdays currentDay;
    private final Inventory edibleInventory;

    public Farm(){
        this.farmHouse = new FarmHouse();
        this.stables = new ArrayList<>();
        this.coops = new ArrayList<>();
        this.field = new Field();
        this.farmVehicles = new ArrayList<>();
        this.aircraft = new CropDuster();
        // Default to sunday
        this.currentDay = Weekdays.SUNDAY;
        this.edibleInventory = new Inventory();
        setUpFarm();
    }

    private void setUpFarm() {
        /* A farm has:
        2 people (Froilan and Froilanda)
        1 Field with 5 Crop Row
        15 Chicken in 4 ChickenCoop
        10 Horse in 3 Stable
        2 FarmVehicle
        1 Aircraft
         */
        setUpFarmVehicles();
        setUpFarmHouse();
        setUpCoops(15);
        setUpStables(10);
        createField();
        initializeInventory();
    }

    protected void setUpFarmHouse(){
        List<Person> farmers = new ArrayList<>(Farmers.getInstance().getFarmerList());
        this.farmHouse.addPeople(farmers);
    }

    protected void setUpCoops(int numChickens){
        // 4 coops with 4 4 4 3 chickens
        for(int i = 0; i < 4; i++){
            this.coops.add(new ChickenCoop());
        }
        for(ChickenCoop c : this.coops){
            if(numChickens < 4){
                c.addChickens(numChickens);
                numChickens = 0;
            }
            else{
                c.addChickens(4);
                numChickens -= 4;
            }
        }
    }

    protected void setUpStables(int numHorse){
        // 3 stables with 4 4 2
        for(int i = 0; i < 3; i++){
            this.stables.add(new Stable());
        }
        for(Stable s : this.stables){
            if(numHorse < 4){
                s.addHorses(numHorse);
                numHorse = 0;
            }
            else{
                s.addHorses(4);
                numHorse -= 4;
            }
        }
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getCoops() {
        return coops;
    }

    public Field getCompleteField() {
        return this.field;
    }

    public void createField() {
        this.field.setField(new CornStalk());
        this.field.setField(new TomatoPlant());
        this.field.setField(new WheatPlant());
        this.field.setField(new CornStalk());
        this.field.setField(new CornStalk());
    }

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public Weekdays getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(Weekdays day){
        this.currentDay = day;
    }

    public Inventory getEdibleInventory() {
        return edibleInventory;
    }

    public void dailyActivities(){
        // Everyone eats breakfast, ride and feed horses, do daily routine
        tendHorses();
        for(Person p : this.farmHouse.getInhabitants()){
            if(p instanceof Farmer){
                ((Farmer) p).eatBreakfast(this.edibleInventory);
                this.currentDay.getRoutine().doRoutine(this, (Farmer) p);
            }
        }
    }

    public void tendHorses() {
        for (Stable s : this.stables) {
            for (Horse horse : s.getHorses()) {
                horse.ride();
                horse.feedHorse(this.edibleInventory);
            }
        }
    }

    protected void setUpFarmVehicles(){
        this.farmVehicles.add(new Tractor());
        this.farmVehicles.add(new Tractor());
    }

    private void initializeInventory(){
        this.edibleInventory.addMultiple(new EarCorn(), 100);
        this.edibleInventory.addMultiple(new Tomato(), 50);
        this.edibleInventory.addMultiple(new Egg(), 50);
        this.edibleInventory.addMultiple(new Wheat(), 20);
    }
}
