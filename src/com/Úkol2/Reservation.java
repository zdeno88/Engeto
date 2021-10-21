package com.Úkol2;

import java.time.LocalDate;

public class Reservation {
    private Guest guest1;
    private Guest guest2;
    private Room room;
    private LocalDate comingDate;
    private LocalDate leavingDate;

    public Reservation(Guest guest1, Guest guest2, Room room,LocalDate comingDate, LocalDate leavingDate) {
        this.guest1 = guest1;
        this.guest2 = guest2;
        this.room=room;
        this.comingDate = comingDate;
        this.leavingDate = leavingDate;
    }

   public String getDescription(){
        if(guest2!=null)
        return guest1.getDescription()+"\n"+guest2.getDescription()+"\n"+room.getDescription();
        else
        return guest1.getDescription()+"\n"+room.getDescription();
    }

    public Guest getGuest1() {
        return guest1;
    }
    public void setGuest1(Guest guest1) {
        this.guest1 = guest1;
    }

    public Guest getGuest2() {
        return guest2;
    }
    public void setGuest2(Guest guest2) {
        this.guest2 = guest2;
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
