package com.theironyard.novauc;

/**
 * Created by willc on 2/7/17.
 */
public class Orc extends Monster {


    /*********************
     * Variables
     *********************/
     private String name;
     private String tribe;
     private String language;
     private boolean armor;
     private boolean hasMagic;

    /*********************
     * Constructors
     *********************/

    public Orc(){
        name = "unknown";
        tribe = "unknown";
        language = "common";
        armor = false;
        hasMagic = false;
    }
    public Orc(String name, String tribe, String language, boolean armor, boolean hasMagic){
        this.name = name;
        this.tribe = tribe;
        this.language = language;
        this.armor = armor;
        this.hasMagic = hasMagic;
    }

    /*********************
     * Setters
     *********************/

    public void setName(String name) {
        this.name = name;
    }
    public void setTribe(String tribe) {
        this.tribe = tribe;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setArmor(boolean armor) {
        this.armor = armor;
    }
    public void setHasMagic(boolean hasMagic) {
        this.hasMagic = hasMagic;
    }

    /*********************
     * Getters
     *********************/

    public String getName() {
        return name;
    }
    public String getTribe() {
        return tribe;
    }
    public String getLanguage() {
        return language;
    }
    public boolean getArmor() {
        return armor;
    }
    public boolean getHasMagic() {
        return hasMagic;
    }
    public String warcry(){
        return "ARGGSGSDGSDGSDDDD!!!!!";
    }

    /*********************
     * Other Methods
     *********************/

//    public double victoryChance(){
//        double victoryChance = 3;
//        if (armor){
//            victoryChance++;
//        }
//        if (hasMagic){
//            victoryChance++;
//        }
//        return victoryChance;
//    }
}
