package com.Úkol2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    public static void main(String[] args) {
        ArrayList<Reservation> list=new ArrayList<>();
        
        Guest adela=new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest jan=new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));
//        Guest nul=new Guest("...","...",LocalDate.EPOCH);
//        System.out.println(adela.getDescription());
//        System.out.println(jan.getDescription());

        Room room1=new Room(1,1,true,true,1000);
        Room room2=new Room(2,1,true,true,1000);
        Room room3=new Room(3,3,false,true,2400);
//        System.out.println(room1.getDescription());
//        System.out.println(room2.getDescription());
//        System.out.println(room3.getDescription());

        Reservation res1=new Reservation(adela,room1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),JePracovni.PRACOVNI);
        Reservation res2=new Reservation(adela,room3,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),JePracovni.SOUKROMY);
        res2.addGuestList(jan);
        list.add(res1);
        list.add(res2);

        for (Reservation resPrint:list) {

            System.out.print(resPrint.getDescription());
            System.out.println("--------------------");

        }
//        System.out.println(res2.getGuestList());



    }
}
