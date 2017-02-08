package com.theironyard.novauc;

/**
 * Created by willc on 2/7/17.
 */
public class Sword extends Weapon{
    /*********************
     * Variables
     *********************/
    private String maker;
    private int numUses;
    private double cost;
    private boolean isLegendary;
    private boolean isUnique;

    /*********************
     * Constructors
     *********************/

    public Sword(){
        maker = "unknown";
        numUses = 0;
        cost = 9.99;
        isLegendary = false;
        isUnique = false;
    }
    public Sword(String maker, int numUses, double cost, boolean isLegendary, boolean isUnique){
        this.maker = maker;
        this.numUses = numUses;
        this.cost = cost;
        this.isLegendary = isLegendary;
        this.isUnique = isUnique;
    }

    /*********************
     * Setters
     *********************/

    public void setMaker(String maker) {
        this.maker = maker;
    }
    public void setNumUses(int numUses) {
        this.numUses = numUses;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setIsLegendary(boolean isLegendary) {
        this.isLegendary = isLegendary;
    }
    public void setIsUnique(boolean isUnique) {
        this.isUnique = isUnique;
    }

    /*********************
     * Getters
     *********************/

    public String getMaker() {
        return maker;
    }
    public int getNumUses() {
        return numUses;
    }
    public double getCost() {
        return cost;
    }
    public boolean getIsLegendary() {
        return isLegendary;
    }
    public boolean getIsUnique() {
        return isUnique;
    }
}
