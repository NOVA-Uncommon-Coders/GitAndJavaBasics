package com.theironyard.novauc;

import com.sun.tools.internal.ws.processor.model.Model;

import java.util.Currency;

/**
 * Created by peter on 2/7/17.
 */
public class car {
    Currency cost;
    double horsePower;
    String color;
    char model;
    boolean fourDoors;

    char getModel() {
        return model;
    }

    void setModel(char model) {
        this.model = model;
    }

    double getHorsePower() {
        return horsePower;
    }

    void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
}
