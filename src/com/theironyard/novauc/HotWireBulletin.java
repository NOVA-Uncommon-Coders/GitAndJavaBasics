package com.theironyard.novauc;

/**
 * Created by Eric on 2/7/17.
 */
    public class HotWireBulletin {
    char user;
    String text;
    boolean empty;
    double exp;
    int time;

    public char getUser() {
        return user;
    }

    public void setUser(char user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}