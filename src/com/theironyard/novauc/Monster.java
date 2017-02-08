package com.theironyard.novauc;

/**
 * Created by willc on 2/7/17.
 */

public class Monster {
    /*********************
     * Variables
     *********************/

    private boolean isScary;
    private boolean hasWeapon;
    private int legs;
    private int hands;
    private int age;

    /*********************
     * Constructors
     *********************/

    public Monster(){
        isScary = true;
        hasWeapon = true;
        legs = 2;
        hands = 2;
        age = 21;
    }

    public Monster(boolean isScary, boolean hasWeapon, int legs, int hands, int age){
        this.isScary = isScary;
        this.hasWeapon = hasWeapon;
        this.legs = legs;
        this.hands = hands;
        this.age = age;
    }

    /*********************
     * Setters
     *********************/

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }
    public void setHands(int hands) {
        this.hands = hands;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIsScary(boolean scary) {
        this.isScary = scary;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /*********************
     * Getters
     *********************/

    public boolean getHasWeapon() {
        return hasWeapon;
    }
    public boolean getIsScary() {
        return isScary;
    }
    public int getLegs() {
        return legs;
    }
    public int getHands() {
        return hands;
    }
    public int getAge() {
        return age;
    }

    /*********************
     * Other Methods
     *********************/

    public double victoryChance(){
        double victoryChance = age;
        if (hasWeapon){
            victoryChance++;
        }
        if (isScary){
            victoryChance++;
        }
        return victoryChance;
    }
    public String toString(){
        return getClass().getName();
    }
}
