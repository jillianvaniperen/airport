package com.capgemini.airport.airplane;

import java.util.ArrayList;

public class Airport {

    private String nameAirport;
    private ArrayList<PassengerPlane> passengerPlanes = new ArrayList<>();
    private ArrayList<CargoPlane> cargoPlanes = new ArrayList<>();

    public Airport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public PassengerPlane addPassengerPlane(PassengerPlane passengerPlane) {
        passengerPlanes.add(passengerPlane);
        return passengerPlane;
    }

    public CargoPlane addCargoPlane(CargoPlane cargoPlane) {
        cargoPlanes.add(cargoPlane);
        return cargoPlane;
    }

    public void printPassengerAirplanes() {
        System.out.println("Available fleet of passenger planes on " + nameAirport + ": ");
        for (PassengerPlane passengerPlane : passengerPlanes) {
            System.out.println(passengerPlane);
        }
        System.out.println();
    }

    public void printCargoAirplanes() {
        System.out.println("Available fleet of cargo planes on " + nameAirport + ": ");
        for (CargoPlane cargoPlane : cargoPlanes) {
            System.out.println(cargoPlane);
        }
        System.out.println();
    }

    public PassengerPlane findPassengerPlaneByPlaneId(String planeIdentification) {
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPlaneIdentification().equals(planeIdentification)) {
                return passengerPlane;
            }
        }
        return null;
    }

    public CargoPlane findCargoPlaneByPlaneId(String planeIdentification) {
        for (CargoPlane cargoPlane : cargoPlanes) {
            if (cargoPlane.getPlaneIdentification().equals(planeIdentification)) {
                return cargoPlane;
            }
        }
        return null;
    }

    public ArrayList<PassengerPlane> requestAllAvailablePassengerPlanes() {
        ArrayList<PassengerPlane> availablePassengerPlanes = new ArrayList<>();
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.isAvailable()) {
//                System.out.println("Plane " + passengerPlane + " is available.");
//                System.out.println("There are still " + passengerPlane.availableSeatsOnAirplane() + " empty seats.\n");
                availablePassengerPlanes.add(passengerPlane);
            } else {
//                System.out.println(passengerPlane + " is flying. Wait for the plane to be landed to board passengers.\n");
            }
        }
        return availablePassengerPlanes;
    }

    public ArrayList<CargoPlane> requestNextAvailableCargoAirplane() {
        ArrayList<CargoPlane> availableCargoPlanes = new ArrayList<>();
        for (CargoPlane cargoPlane : cargoPlanes) {
            if (cargoPlane.isAvailable()) {
//                System.out.println("Plane " + cargoPlane + " is available.");
//                System.out.println("There is still room to store " + cargoPlane.availableFreightSpace() + " tons of freight.\n");
                availableCargoPlanes.add(cargoPlane);
            } else {
//                System.out.println(cargoPlane + " is not available.");
            }
        }
        return availableCargoPlanes;
    }

}



