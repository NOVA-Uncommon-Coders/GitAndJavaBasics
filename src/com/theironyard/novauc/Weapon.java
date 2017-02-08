package com.theironyard.novauc;

/**
 * Created by willc on 2/7/17.
 */
public class Weapon {
    /*********************
     * Variables
     *********************/
    private int age;
    private int durability;
    private int speed;
    private boolean isEnchanted;
    private String quality;

    /*********************
     * Constructors
     *********************/

    public Weapon(){
        age = 0;
        durability = 5;
        speed = 2;
        isEnchanted = false;
        quality = "Normal";
    }
    public Weapon(int age, int durability, int speed, boolean isEnchanted, String quality){
        this.age = age;
        this.durability = durability;
        this.speed = speed;
        this.isEnchanted = isEnchanted;
        this.quality = quality;
    }

    /*********************
     * Setters
     *********************/

    public void setAge(int age) {
        this.age = age;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setIsEnchanted(boolean isEnchanted) {
        this.isEnchanted = isEnchanted;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /*********************
     * Getters
     *********************/

    public int getAge() {
        return age;
    }
    public int getDurability() {
        return durability;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getIsEnchanted() {
        return isEnchanted;
    }
    public String getQuality() {
        return quality;
    }
}
