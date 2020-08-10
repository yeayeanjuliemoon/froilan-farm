package com.zipcodewilmington.froilansfarm.farm;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestFarmHouse {

    private FarmHouse farmHouse;

    @Before
    public void setUp(){
        this.farmHouse = new FarmHouse();
    }

    @Test
    public void testShelter(){
        assertNotNull(this.farmHouse);
    }

    @Test
    public void testAddPerson(){
        Farmer p = new Farmer("Frank", 1);

        this.farmHouse.addPerson(p);

        List<Person> personList = this.farmHouse.getInhabitants();

        assertTrue(personList.contains(p));
    }

    @Test
    public void testAddPeople(){
        Farmer p1 = new Farmer("Frank", 1);
        Farmer p2 = new Farmer("Frankerella", 2);
        ArrayList<Person> expected = new ArrayList<>();
        expected.add(p1);
        expected.add(p2);

        this.farmHouse.addPeople(expected);

        List<Person> actual = this.farmHouse.getInhabitants();

        assertEquals(expected, actual);
    }

}
