package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	dodge ram1500 = new dodge();
	ram1500.setDoors(4);
	ram1500.setDrive("4");
	ram1500.setFuel("gas");
	ram1500.setPassengers(4);
	ram1500.setType("truck");


	chevy camaro = new chevy();
	camaro.setDoors(2);
	camaro.setDrive("2");
	camaro.setFuel("gas");
	camaro.setPassengers(4);
	camaro.setType("car");


	ford bronco = new ford();
	bronco.setDoors(4);
	bronco.setDrive("4");
	bronco.setFuel("gas");
	bronco.setPassengers(4);
	bronco.setType("truck");


	nissan frontier = new nissan();
	frontier.setDoors(4);
	frontier.setDrive("2");
	frontier.setFuel("diesel");
	frontier.setPassengers(4);
	frontier.setType("truck");


	mitsubishi eclipse = new mitsubishi();
	eclipse.setDoors(2);
	eclipse.setDrive("2");
	eclipse.setFuel("gas");
	eclipse.setPassengers(4);
	eclipse.setType("car");
    }

}
