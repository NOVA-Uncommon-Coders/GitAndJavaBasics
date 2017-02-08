package com.theironyard.novauc;

/**
 * Created by willc on 2/7/17.
 */
public class Dragon extends Monster {
    private double breathLength;
    private boolean hasWings;
    private boolean hasMagic;
    private String language;
    private String name;

    /*********************
     * Constructors
     *********************/

    public Dragon(){
        breathLength = 5.0;
        hasWings = true;
        hasMagic = false;
        language = "unknown";
        name = "unknown";
    }
    public Dragon(double breathLength, boolean hasWings, boolean hasMagic, String language, String name, boolean hasWeapon, int hands){
        super(false, hasWeapon, 10, hands, 20);
        this.breathLength = breathLength;
        this.hasWings = hasWings;
        this.hasMagic = hasMagic;
        this.language = language;
        this.name = name;

    }

    /*********************
     * Setters
     *********************/

    public void setBreathLength(double breathLength) {
        this.breathLength = breathLength;
    }
    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }
    public void setHasMagic(boolean hasMagic) {
        this.hasMagic = hasMagic;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*********************
     * Getters
     *********************/

    public double getBreathLength() {
        return breathLength;
    }
    public boolean getHasWings() {
        return hasWings;
    }
    public boolean getHasMagic() {
        return hasMagic;
    }
    public String getLanguage() {
        return language;
    }
    public String getName() {
        return name;
    }

    /*********************
     * Other Methods
     *********************/

    public String dragonSpeak(){
        return "Rawr!!!!!!";
    }
    public double victoryChance(){
        double victoryChance = breathLength * 10;
        if (hasWings){
            victoryChance++;
        }
        if (hasMagic){
            victoryChance++;
        }
        return victoryChance;
    }
}
