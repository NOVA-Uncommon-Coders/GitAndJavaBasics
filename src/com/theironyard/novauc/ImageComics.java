package com.theironyard.novauc;

/**
 * Created by vtcurry on 2/7/17.
 */
public class ImageComics {
        String CompanyName;
        String location;
        int numberofheros;
        int nuberofvillans;
        boolean isStillPublished;

        public String getCompanyName() {
            return CompanyName;
        }

        public void setCompanyName(String companyName) {
            CompanyName = companyName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getNumberofheros() {
            return numberofheros;
        }

        public void setNumberofheros(int numberofheros) {
            this.numberofheros = numberofheros;
        }

        public int getNuberofvillans() {
            return nuberofvillans;
        }

        public boolean isStillPublished() {
            return isStillPublished;
        }

        public void setStillPublished(boolean stillPublished) {
            isStillPublished = stillPublished;
        }

        public void setNuberofvillans(int nuberofvillans) {
            this.nuberofvillans = nuberofvillans;
        }
}
