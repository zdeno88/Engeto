package com.Ukol5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfPlants {

    private List<Plant> listOfPlants=new ArrayList<>();

    public static ListOfPlants loadFromTextFile(String FILE_NAME) {
        final int POCET_V_POLI=5;
        int numLine=0;
        String FILE_ITEM_DELIMITER = ";";
        ListOfPlants result=new ListOfPlants();
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] pole = line.split(FILE_ITEM_DELIMITER);
                numLine++;
                if (pole.length != POCET_V_POLI)
                    throw new PlantException("Nespravny pocet v poli: " + numLine);
                result.addToList(new Plant(pole[0].trim(), pole[1].trim(), pole[4].trim(), pole[3].trim(), pole[2].trim()));
            }
        } catch (FileNotFoundException | PlantException e) {
            System.out.println("Vstupni soubor nenalezen");
        }
        return result;
    }

    public void addToList(Plant plant){
        listOfPlants.add(plant);
    }
    public void removeFromList(int plant){
        listOfPlants.remove(plant);
    }
    public String getParticularPlantInfo(int plant) throws PlantException {
        return listOfPlants.get(plant).getWateringInfo();
    }
    public String getPlantsInfo() throws PlantException {
        StringBuilder buider=new StringBuilder();
        for (Plant plant:listOfPlants) {
            buider.append(plant.writeToFile());
        }
        return buider.toString();
    }



}
