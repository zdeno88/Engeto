package com.company;

public class Room {
    private int roomNumber;
    private int bedCapacity;
    private boolean withBalcony;
    private boolean viewToSee;
    private int price;

    public Room(int roomNumber,int bedCapacity, boolean withBalcony, boolean viewToSee, int price) {
        this.roomNumber=roomNumber;
        this.bedCapacity = bedCapacity;
        this.withBalcony = withBalcony;
        this.viewToSee = viewToSee;
        this.price = price;
    }

    public String getDescription(){
        return "Cislo pokoje: "+getRoomNumber()+"\nPocet posteli: "+getBedCapacity()+"\nS balkonem: "+isWithBalcony()+"\nS vyhledem na more: "+isViewToSee()+"\nCena: "+getPrice()+"Kc/noc\n";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getBedCapacity() {
        return bedCapacity;
    }
    public void setBedCapacity(int bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    public String isWithBalcony() {
        if(withBalcony)
        return "ano";
        return "ne";
    }
    public void setWithBalcony(boolean withBalcony) {
        this.withBalcony = withBalcony;
    }

    public String isViewToSee() {
        if(viewToSee)
            return "ano";
        return "ne";
    }
    public void setViewToSee(boolean viewToSee) {
        this.viewToSee = viewToSee;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
