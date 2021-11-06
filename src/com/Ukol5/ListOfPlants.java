package com.Ukol5;

import java.util.ArrayList;
import java.util.List;

public class ListOfPlants {
    private List<Plant> listOfPlants=new ArrayList<>();

    public void addToList(Plant plant){
        listOfPlants.add(plant);
    }
    public void removeFromList(int plant){
        listOfPlants.remove(plant);
    }
    public String printParticularPlant(int plant) throws PlantException {
        return listOfPlants.get(plant).getWateringInfo();
    }
    public String printPlant() throws PlantException {
        StringBuilder buider=new StringBuilder();
        for (Plant plant:listOfPlants) {
            buider.append(plant.getWateringInfo());
        }
        return buider.toString();

    }
}
