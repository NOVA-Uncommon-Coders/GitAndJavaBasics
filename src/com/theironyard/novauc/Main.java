package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
        Cakes brownie = new Cakes();
        Cakes lemonCake=new Cakes();
        Cakes poundCake=new Cakes();

        brownie.setName("Brownie");
        brownie.setCalories(550);
        brownie.setServingSize(2);
        brownie.setRating(8);

        lemonCake.setName("Lemon Cake");
        lemonCake.setCalories(410);
        lemonCake.setServingSize(1);
        lemonCake.setRating(4);

        poundCake.setName("Pound Cake");
        poundCake.setCalories(340);
        poundCake.setServingSize(3);
        poundCake.setRating(7);

        System.out.println(brownie.getName());
        System.out.println("Is this snack healthy???   "+brownie.isHealthy(brownie.getCalories(),brownie.getServingSize()));
        System.out.println(lemonCake.getName());
        System.out.println("Is this snack healthy???   "+lemonCake.isHealthy(lemonCake.getCalories(),lemonCake.getServingSize()));
        System.out.println(poundCake.getName());
        System.out.println("Is this snack healthy???   "+poundCake.isHealthy(poundCake.getCalories(),poundCake.getServingSize()));

        Candy snickers = new Candy();

        snickers.setRating(9);
        snickers.setServingSize(1);
        snickers.setCalories(499);
        snickers.setFlavor("Chocolate");
        snickers.setName("Snickers");
        System.out.println(snickers.getName());
        System.out.println("Is this snack healthy???   "+snickers.isHealthy(snickers.getCalories(),snickers.getServingSize()));

        Chips doritos = new Chips();

        doritos.setName("Doritos");
        doritos.setBaked(true);
        doritos.setRating(8);
        doritos.setServingSize(2);
        doritos.setCalories(300);

        System.out.println(doritos.getName());
        System.out.println("Is this snack healthy???   "+doritos.isHealthy(doritos.getCalories(),doritos.getServingSize()));


        Pastries poptarts = new Pastries();

        poptarts.setName("POP-Tarts");
        poptarts.setCalories(1200);
        poptarts.setRating(3);
        poptarts.setServingSize(2);

        System.out.println(poptarts.getName());
        System.out.println("Is this snack healthy???   "+poptarts.isHealthy(poptarts.getCalories(),poptarts.getServingSize()));


        Sodas pepsi = new Sodas();
        pepsi.setName("Pepsi");
        pepsi.setServingSize(1);
        pepsi.setRating(8);
        pepsi.setCalories(900);
        pepsi.setCaffineFree(false);

        System.out.println(pepsi.getName());
        System.out.println("Is this snack healthy???   "+pepsi.isHealthy(pepsi.getCalories(),pepsi.getServingSize()));
    }
}
