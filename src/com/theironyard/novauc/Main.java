package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Credits money = new Credits();
            money.setAmount(0);
            money.setEmpty(true);
            money.setCash("Account Amount");
            money.setCreditsMax(100);
            money.setGreeting("You may deposit up to 100 credits into account");

        Flash post = new Flash();
            post.setOnline(true);
            post.setText(" ");
            post.setCharacters(false);
            post.setTime(0000);
            post.setUser(' ');

         HotWireBulletin bulletin = new HotWireBulletin();
            bulletin.setUser(' ');
            bulletin.setText(" ");
            bulletin.setEmpty(true);
            bulletin.setTime(0000);
            bulletin.setExp(00);


         Message msg = new Message();
            msg.setTime(0000);
            msg.setEmpty(true);
            msg.setLogo(' ');
            msg.setOnline(true);
            msg.setText(" ");


         User who = new User();
            who.setOnline(true);
            who.setLogo(' ');
            who.setExp(00);
            who.setName(" ");
            who.setOnlineTime(0000);
            who.setStreamUp(false);
            
    }





}
