package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("So the Journey Begins");

        Tweet me = new Tweet();
        me.text = "I don't like Tweeter";
        me.username = "Mad Tweeter";
        me.timestamp = 8;
        me.isPrivate = false;
        me.lessthan140Charcters = true;

        System.out.println("What's in the Tweet: " + me.text);
        System.out.println("Username is: " + me.username);
        System.out.println("Timestamp is: " + me.timestamp);
        System.out.println("Is your account Private?: " + me.isPrivate);
        System.out.println("Less than 140 Characters?: " + me.lessthan140Charcters);











    }
}
