package com.Ukol5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PlantException {
        final String FILE_NAME="C:\\Users\\skaryd\\Documents\\Engeto\\Engeto\\src\\com\\Ukol4\\kvetiny.txt";
        File file=new File(FILE_NAME);
        final int POCET_V_POLI=5;
        ListOfPlants listOfPlants=new ListOfPlants();
        int numLine=0;
        try (Scanner scanner=new Scanner(file)){
            while (scanner.hasNextLine()){
                String line= scanner.nextLine();
                String []pole=line.split(";");
                numLine++;
                if (pole.length!=POCET_V_POLI)
                    throw new PlantException("Nespravny pocet v poli: "+numLine);
                listOfPlants.addToList(new Plant(pole[0].trim(),pole[1].trim(),pole[4].trim(),pole[3].trim(),pole[2].trim()));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("soubor nenalezen");
        }
        Plant ros1=new Plant("orchidej", LocalDate.of(2020,1,1),1);
        Plant ros2=new Plant("ruze");
        Plant ros3=new Plant("narcis");
        ListOfPlants list=new ListOfPlants();
        list.addToList(ros1);
        list.addToList(ros2);
        list.addToList(ros3);
        System.out.println(listOfPlants.printParticularPlant(0));

        File finalFile=new File("C:\\Users\\skaryd\\Documents\\Engeto\\Engeto\\src\\com\\Ukol4\\kvetiny2.txt");
        listOfPlants.addToList(ros1);
        listOfPlants.addToList(ros2);
        listOfPlants.removeFromList(2);

        try (PrintWriter pw=new PrintWriter(finalFile)){
            pw.println(listOfPlants.printPlant());
        }
        catch (FileNotFoundException e){
            System.out.println("Final slozka nenalezena");
        }

    }
}
