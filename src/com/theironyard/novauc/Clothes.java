package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Clothes {
    boolean top;
    int size;
    double length;
    String color;
    boolean folded;

    int getSize() {
        return size;
    }

    void setSize(int size) {

        if (size < 51) {
            this.size = size;
        }
        else {
            System.out.println("Not a valid size");
        }
    }


}
