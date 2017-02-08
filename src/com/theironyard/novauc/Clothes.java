package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Clothes {
    boolean isTop;
    private int size;
    private double length;
    String color;
    boolean folded;


    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    void changesize() {
        this.size = size + 1;
    }

    ////

    void setLength(double length) {
        this.length = length;
    }

    double getLength() {
        return length;
    }









    /*

    void setSize(int size) {

        if (size < 51) {
            this.size = size;
        }
        else {
            System.out.println("Not a valid size");
        }
    }
    */
    boolean getisTop() {
        return isTop;
    }
    void setisTop(boolean isTop) {
        this.isTop = isTop;
    }




}
