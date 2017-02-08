package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Residence {
    String type;
    double size;
    int floors;
    boolean balcony;
    boolean shared;

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    int getFloors() {
        return floors;
    }

    void setFloors(int floors) {

        if (floors > 4 && floors < 100) {
            this.floors = floors;
        }
        else {
            System.out.println("Not an apartment");
        }
    }


}
