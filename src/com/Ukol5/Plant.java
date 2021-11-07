package com.Ukol5;

import java.time.LocalDate;

public class Plant {
    private String name;
    private String notes;
    private LocalDate planted;
    private LocalDate watering;
    private int frequencyOfWatering;
    public Plant(String name, String notes, String planted, String watering, String frequencyOfWatering) throws PlantException {
        this.name = name;
        this.notes = notes;
        if (LocalDate.parse(watering).isBefore(LocalDate.parse(planted))){
            throw new PlantException("Spatne zadane datum->zalevani je pred zasazenim");
        }
        this.planted = LocalDate.parse(planted);
        this.watering = LocalDate.parse(watering);

        try {
            if (Integer.parseInt(frequencyOfWatering)<=0)
                throw new PlantException("Nulove nebo zaporne cislo");
            this.frequencyOfWatering = Integer.parseInt(frequencyOfWatering);
        }
        catch (NumberFormatException e){
            System.out.println("Nespravny format cisla ze souboru!!! ");
        }
    }
    public Plant(String name, String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) throws PlantException {
        this.name = name;
        this.notes = notes;
        if (watering.isBefore(planted)){
            throw new PlantException("Spatne zadane datum->zalevani je pred zasazenim");
        }
        this.planted = planted;
        this.watering = watering;
        if (frequencyOfWatering<=0)
            throw new PlantException("Nulove nebo zaporne cislo");
        this.frequencyOfWatering = frequencyOfWatering;
    }
    public Plant(String name, LocalDate planed, int frequencyOfWatering) throws PlantException{
        this(name, null,planed,LocalDate.now(),frequencyOfWatering);

    }
    public Plant(String name) throws PlantException{
        this(name, null, LocalDate.now(),LocalDate.now(),7);
    }

    public String getWateringInfo()throws PlantException{
        return "Nazev kvetiny: "+getName()+"\nDatum posledni zalivky: "+getWatering()+"\nDatum doporucene dalsi zalivky: "+getWatering().plusDays(frequencyOfWatering)+"\n\n";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted(){
        return planted;
    }
    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering(){
        return watering;
    }
    public void setWatering(LocalDate watering) {
        this.watering = watering;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }
    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering<=0)
            throw new PlantException("Nulove nebo zaporne cislo");
        this.frequencyOfWatering = frequencyOfWatering;
    }
}
