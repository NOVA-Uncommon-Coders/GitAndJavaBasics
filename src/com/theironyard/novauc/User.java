package com.theironyard.novauc;

/**
 * Created by Eric on 2/7/17.
 */
public class User {
    String name;
    double exp;
    boolean online;
    int onlineTime;
    boolean streamUp;
    char logo;


    public char getLogo() {
        return logo;
    }
    public void setLogo(char logo) {
        this.logo = logo;
    }




    public boolean isStreamUp() {
        return streamUp;
    }
    public void setStreamUp(boolean streamUp) {
        this.streamUp = streamUp;
    }




    public int getOnlineTime() {
        return onlineTime;
    }
    public void setOnlineTime(int onlineTime) {
        this.onlineTime = onlineTime;
    }




    public boolean isOnline() {
        return online;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }




    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

