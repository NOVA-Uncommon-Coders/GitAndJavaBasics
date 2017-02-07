package com.theironyard.novauc;

/**
 * Created by Eric on 2/7/17.
 */
public class Flash {
    char user;
    String text;
    boolean isOnline;
    boolean characters;
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

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public boolean isCharacters() {
        return characters;
    }

    public void setCharacters(boolean characters) {
        this.characters = characters;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}