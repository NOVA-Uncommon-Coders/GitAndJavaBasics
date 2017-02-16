package com.theironyard.novauc;

public class Main {
   // System.out.println(" . ");
    public static void main(String[] args) {
        DCComics dccomics = new DCComics();
        MarvelComics marvelcomics = new MarvelComics();
        DarkHorseComics darkHorsecomics = new DarkHorseComics();
        ImageComics imagecomics = new ImageComics();
        IDWPublishing idwpublishing = new IDWPublishing();

        dccomics.setNumberofheros(100);
        dccomics.setNuberofvillans(50);
        dccomics.setStillPublished(true);
        dccomics.setLocation("New York");
        dccomics.setCompanyName("DC");

        marvelcomics.setNumberofheros(50);
        marvelcomics.setNuberofvillans(25);
        marvelcomics.setStillPublished(true);
        marvelcomics.setLocation("New York");
        marvelcomics.setCompanyName("Marvel");

        darkHorsecomics.setNumberofheros(10);
        darkHorsecomics.setNuberofvillans(5);
        darkHorsecomics.setStillPublished(true);
        darkHorsecomics.setLocation("Oregon");
        darkHorsecomics.setCompanyName("Dark Horse");

        imagecomics.setNumberofheros(50);
        imagecomics.setNuberofvillans(50);
        imagecomics.setStillPublished(true);
        imagecomics.setLocation("Oregon");
        imagecomics.setCompanyName("Image");

        idwpublishing.setNumberofheros(10);
        idwpublishing.setNuberofvillans(10);
        idwpublishing.setStillPublished(true);
        idwpublishing.setLocation("California");
        idwpublishing.setCompanyName("IDWP");


        System.out.println("Where is this Comic Book published? " + dccomics.getLocation());
        System.out.println("Where is this Comic Book published? " + marvelcomics.getLocation());
        System.out.println("Where is this Comic Book published? " + darkHorsecomics.getLocation());
        System.out.println("Where is this Comic Book published? " + imagecomics.getLocation());
        System.out.println("Where is this Comic Book published? " + idwpublishing.getLocation());

        }
    }