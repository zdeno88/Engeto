package com.Úkol2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    private Guest guest;
    private ArrayList<Guest> guestList=new ArrayList<>();
    private Room room;
    private LocalDate comingDate;
    private LocalDate leavingDate;

    public Reservation(Guest guest, Room room,LocalDate comingDate, LocalDate leavingDate) {
        this.guest = guest;
        this.room=room;
        this.comingDate = comingDate;
        this.leavingDate = leavingDate;
    }

   public String getDescription(){
         return guest.getDescription()+getGuestList()+"\n"+room.getDescription();
    }

    public String getGuestList(){
        StringBuilder result = new StringBuilder();
        for (Guest x:guestList) {
            result.append("\n").append(x.getDescription());
        }
        return result.toString();
    }

    public void setGuestList(Guest host) {
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
