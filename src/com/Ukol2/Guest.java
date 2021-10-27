package com.Ukol2;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate dateOfBirthday;

    public Guest(String name, String surname, LocalDate dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getDescription(){
        return "Jmeno: "+getName()+"\nPrijmeni: "+getSurname()+"\nDatum narozeni: "+getDateOfBirthday()+"\n";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }
    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

}
