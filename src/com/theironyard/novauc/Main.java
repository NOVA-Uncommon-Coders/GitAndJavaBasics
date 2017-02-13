package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
        DCComics DCComics = new DCComics();
        MarvelComics MarvelComics = new MarvelComics();
        DarkHorseComics DarkHorseComics = new DarkHorseComics();
        ImageComics ImageComics = new ImageComics();
        IDWPublishing IDWPublishing = new IDWPublishing();

        DCComics.setNumberofheros(100);
        DCComics.setNuberofvillans(50);
        DCComics.setStillPublished(true);
        DCComics.setLocation("New York");
        DCComics.setCompanyName("DC");

        MarvelComics.setNumberofheros(50);
        MarvelComics.setNuberofvillans(25);
        MarvelComics.setStillPublished(true);
        MarvelComics.setLocation("New York");
        MarvelComics.setCompanyName("Marvel");

        DarkHorseComics.setNumberofheros(10);
        DarkHorseComics.setNuberofvillans(5);
        DarkHorseComics.setStillPublished(true);
        DarkHorseComics.setLocation("Oregon");
        DarkHorseComics.setCompanyName("Dark Horse");

        ImageComics.setNumberofheros(50);
        ImageComics.setNuberofvillans(50);
        ImageComics.setStillPublished(true);
        ImageComics.setLocation("Oregon");
        ImageComics.setCompanyName("Image");

        IDWPublishing.setNumberofheros(10);
        IDWPublishing.setNuberofvillans(10);
        IDWPublishing.setStillPublished(true);
        IDWPublishing.setLocation("California");
        IDWPublishing.setCompanyName("IDWP");
        //  {

    }
}