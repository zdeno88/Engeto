package com.Ukol5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        final String FILE_NAME="C:\\Users\\skaryd\\Documents\\Engeto\\Engeto\\src\\com\\Ukol5\\kvetiny.txt";
        ListOfPlants listOfPlants=ListOfPlants.loadFromTextFile(FILE_NAME);

        try {
            Plant ros1 = new Plant("orchidej", LocalDate.of(2020, 1, 1), 1);
            Plant ros2 = new Plant("ruze");
            Plant ros3 = new Plant("narcis");
            ListOfPlants list = new ListOfPlants();
            list.addToList(ros1);
            list.addToList(ros2);
            list.addToList(ros3);
            listOfPlants.addToList(ros1);
            listOfPlants.addToList(ros2);
        }
        catch (PlantException e){
            e.printStackTrace();
        }
        try {
            System.out.println(listOfPlants.getParticularPlantInfo(0));
        } catch (PlantException e) {
            e.printStackTrace();
        }

        File finalFile=new File("C:\\Users\\skaryd\\Documents\\Engeto\\Engeto\\src\\com\\Ukol5\\kvetiny2.txt");
        listOfPlants.removeFromList(2);

        try (PrintWriter pw=new PrintWriter(finalFile)){
            pw.println(listOfPlants.getPlantsInfo());
        }
        catch (FileNotFoundException | PlantException e){
            System.out.println("Final slozka nenalezena");
        }

    }
}
