package com.capgemini.airport;

import com.capgemini.airport.airplane.Airplane;
import com.capgemini.airport.airplane.Airport;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("KL573", 75);
        airplane1.boardPassengers(100);
        airplane1.takeOff();
        airplane1.land();
        airplane1.dischargePassenger();

        Airplane airplane2 = new Airplane("KL757", 100);
        airplane2.boardPassengers(80);
        airplane2.takeOff();
        airplane2.isFlyingStatus();
        airplane2.land();
        airplane2.dischargePassenger();

        Airport airport = new Airport("Schiphol");
        airport.addAirplane(new Airplane("KL945", 75, 0, false, 0));
        airport.addAirplane(new Airplane("HV315", 80, 0, false, 0));
        airport.addAirplane(new Airplane("HV811", 60, 0, false, 0));
        airport.findAllAirplanes();
        airport.getAvailableSeats();








    }
}
