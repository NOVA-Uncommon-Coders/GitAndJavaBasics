package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	Dragon mike = new Dragon(4.5, true, true,
            "Elvish", "Something", false, 99);
	Orc andrew = new Orc("Hopdeff", "MountTop", "MountTopian" , true, true);


	System.out.println("The battle is about to start!\n\nLeft Corner, you are a DRAGON, sound off!");
	System.out.println(mike.dragonSpeak() + "\n");
	System.out.println("Right corner, you are an ORC, sound off!\n" + andrew.warcry());
	System.out.println("\nLadies and gentlemen, your battle has started!");
	System.out.println("The winner is: " + MonsterFight(andrew, mike).substring(23));



    }
    public static String MonsterFight(Monster firstMon, Monster secondMon){
        return firstMon.victoryChance() > secondMon.victoryChance() ? firstMon.toString():secondMon.toString();
    }
}
