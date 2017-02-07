package com.theironyard.novauc;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        pet fish = new pet();

        fish.type = "Trout";
        fish.Legs = false;

        System.out.println("Fish type: " + fish.type);
        System.out.println("Has legs: " + fish.Legs);

        //home 1

        Residence home = new Residence();
        home.floors = 2;
        System.out.println("Floors in the hiz-ouse: " + home.floors);

        //home 2

        Residence home2 = new Residence();
        home2.setFloors(1);
        System.out.println("home2.floors: "  + home2.floors);

        //home 3
        Residence home3 = new Residence();
        home3.setFloors(6);
        System.out.println("home3.floors: "  + home3.floors);




    }
}
