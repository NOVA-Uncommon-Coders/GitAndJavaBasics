package com.theironyard.novauc;

/**
 * Created by Eric on 2/7/17.
 */
public class Message {
    String text;
    boolean empty;
    boolean isOnline;
    int time;
    char logo;



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

    public boolean isOnline() {
        return isOnline;
    }
    public void setOnline(boolean online) {
        isOnline = online;
    }




    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }




    public char getLogo() {
        return logo;
    }
    public void setLogo(char logo) {
        this.logo = logo;
    }
}
