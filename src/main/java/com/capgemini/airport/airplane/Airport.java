package com.capgemini.airport.airplane;

import java.util.ArrayList;

public class Airport {

    private String nameAirport;
    private ArrayList<PassengerPlane> passengerPlanes = new ArrayList<>();

    public Airport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public PassengerPlane addAirplane(PassengerPlane passengerPlane) {
        passengerPlanes.add(passengerPlane);
        return passengerPlane;
    }

    public void printAirplanes() {
        System.out.println("Available fleet on " + nameAirport + ": ");
        for (PassengerPlane passengerPlane : passengerPlanes) {
            System.out.println(passengerPlane);
        }
        System.out.println();
    }

    public ArrayList<PassengerPlane> getAvailableAirplane() {
        ArrayList<PassengerPlane> availablePassengerPlanes = new ArrayList<>();
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.isAvailable()) {
                System.out.println("Plane " + passengerPlane + " is available");
                System.out.println("There are still " + passengerPlane.availableSeatsOnAirplane() + " seats available.\n");
                availablePassengerPlanes.add(passengerPlane);
            } else {
                System.out.println(passengerPlane + " is flying. Wait for the plane to be landed to board passengers.\n");
            }
        }
        return availablePassengerPlanes;
    }

//    public int boardPassengers() {
//        for (Airplane airplane : airplanes) {
//            if ()
//        }
//        // als het vliegtuig beschikbaar is (niet vliegt) && numbPassengers < maxPas
//        // sout."plane 'planeID' is available"
//        // sout."there are still 'nmb of seats' seats available on the plane."
//        return numPassengers; //aanpassen
//    }


}



