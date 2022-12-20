package com.capgemini.airport.airplane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {

    String nameAirport;
    ArrayList<Airplane> airplanes = new ArrayList<>();

    public Airport() {
    }

    public Airport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public Airplane addAirplane(Airplane airplane) {
        airplanes.add(airplane);
        return airplane;
    }

    public ArrayList<Airplane> findAllAirplanes() {
        System.out.println("Available fleet on " + nameAirport + ": ");
        for (int i = 0; i < airplanes.size(); i++) {
            System.out.println(airplanes.get(i));
        }
        return null;
    }

    public ArrayList<Airplane> getAvailableSeats() {
        for (int i = 0; i < airplanes.size(); i++) {
            System.out.println("Flight " + airplanes.get(i) + " has got seats nmb of seats available");

        }
        return null;
    }

}



