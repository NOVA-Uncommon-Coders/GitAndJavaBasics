package com.theironyard.novauc;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //pet class

        pet fish = new pet();

        fish.type = "Trout";
        fish.Legs = false;

        System.out.println("Fish type: " + fish.type);
        System.out.println("Has legs: " + fish.Legs);


        //clothes class

        Clothes pants = new Clothes();
        pants.color = "blue";
        System.out.println("Color of the pants: " + pants.color);

        pants.setSize(33);
        System.out.println("Current size:" + pants.getSize());

        pants.changesize();
        System.out.println("Changed size:" + pants.getSize());


        Clothes shirt = new Clothes();
        shirt.setLength(16.5);
        System.out.println("Current shirt length:" + shirt.getLength());

        //tvShows

        tvShows station = new tvShows();
        station.setChannel(505);
        System.out.println("Current channel:" + station.getChannel());





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

        //channel
        tvShows channel = new tvShows();
        System.out.println("is this channel a comedy: " + channel.isComedy());




    }
}
