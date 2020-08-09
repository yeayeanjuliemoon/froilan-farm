package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FarmHouse extends Shelter<String, Person>{

    public FarmHouse() {
        super();
    }

    public List<Person> getPersonList(){
        ArrayList<Person> retList = new ArrayList<>();
        retList.addAll(this.inhabitants.values());
        return retList;
    }

    public void addPerson(Person p){
        super.add(p.getName(), p);
    }

    public void addPeople(List<Person> people){
        for(Person p : people){
            addPerson(p);
        }
    }



}
