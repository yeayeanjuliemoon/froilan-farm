package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.weekdayRoutine.Weekdays;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class TestFarm {
    private Farm farm;

    @Before
    public void SetUp(){
        this.farm = new Farm();
    }

    @Test
    public void testFarmHouseSetupCount(){
        Integer expected = 2;

        Integer actual = this.farm.getFarmHouse().getInhabitants().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testFarmHouseSetupPeople(){
        List<Farmer> expected = Farmers.getInstance().getFarmerList();

        List<Person> actual = this.farm.getFarmHouse().getInhabitants();

        assertEquals(expected, actual);
    }

    @Test
    public void testCoopSetup(){
        Integer expected = 4;

        Integer actual = this.farm.getCoops().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testStableSetup(){
        Integer expected = 3;

        Integer actual = this.farm.getStables().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testFarmVehicles(){
        Integer expected = 2;

        Integer actual = this.farm.getFarmVehicles().size();

        assertEquals(expected, actual);
    }

    @Test
    public void testFarmVehiclesAreTractors(){
        assertTrue(this.farm.getFarmVehicles().get(0) instanceof Tractor);
    }

    @Test
    public void testTendHorses(){
        Integer expected = 70;

        this.farm.tendHorses();

        Integer actual = this.farm.getEdibleInventory().getCount(new EarCorn());

        assertEquals(expected, actual);
    }

    @Test
    public void testDailyActivitiesCorn(){
        Integer expected = 67;

        this.farm.dailyActivities();

        Integer actual = this.farm.getEdibleInventory().getCount(new EarCorn());

        assertEquals(expected, actual);
    }

    @Test
    public void testDailyActivitiesEgg(){
        Integer expected = 43;

        this.farm.dailyActivities();

        Integer actual = this.farm.getEdibleInventory().getCount(new Egg());

        assertEquals(expected, actual);
    }

    @Test
    public void testDailyActivitiesTomato(){
        Integer expected = 47;

        this.farm.dailyActivities();

        Integer actual = this.farm.getEdibleInventory().getCount(new Tomato());

        assertEquals(expected, actual);
    }

    @Test
    public void testAircraft(){
        assertTrue(this.farm.getAircraft() instanceof CropDuster);
    }

    @Test
    public void testDay(){
        Weekdays expected = Weekdays.MONDAY;

        this.farm.setCurrentDay(expected);

        Weekdays actual = this.farm.getCurrentDay();

        assertEquals(expected, actual);
    }


}
