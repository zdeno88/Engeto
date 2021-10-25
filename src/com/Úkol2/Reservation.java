package com.Úkol2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    private Guest guest;
    private ArrayList<Guest> guestList=new ArrayList<>();
    private Room room;
    private LocalDate comingDate;
    private LocalDate leavingDate;
    private JePracovni jePracovni;

    public Reservation(Guest guest, Room room,LocalDate comingDate, LocalDate leavingDate, JePracovni jePracovni) {
        this.guest = guest;
        this.room=room;
        this.comingDate = comingDate;
        this.leavingDate = leavingDate;
        this.jePracovni=jePracovni;
    }

   public String getDescription(){
         return guest.getDescription()+getGuestList()+"\n"+room.getDescription()+"Typ pobytu: "+jePracovni.getTyp()+"\n";
    }

    public String getGuestList(){
        StringBuilder result = new StringBuilder();
        for (Guest x:guestList) {
            result.append("\n").append(x.getDescription());
        }
        return result.toString();
    }

    public void addGuestList(Guest host) {
        guestList.add(host);
    }

    public Guest getGuest() {
        return guest;
    }
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getComingDate() {
        return comingDate;
    }
    public void setComingDate(LocalDate comingDate) {
        this.comingDate = comingDate;
    }

    public LocalDate getLeavingDate() {
        return leavingDate;
    }
    public void setLeavingDate(LocalDate leavingDate) {
        this.leavingDate = leavingDate;
    }
}
