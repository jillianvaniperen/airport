package com.capgemini.airport;

import com.capgemini.airport.airplane.PassengerPlane;
import com.capgemini.airport.airplane.Airport;

public class Application {
    public static void main(String[] args) {

        PassengerPlane passengerPlane1 = new PassengerPlane("KL573", 75);
        passengerPlane1.boardPassengers(100);
        passengerPlane1.takeOff();
        passengerPlane1.land();
        passengerPlane1.dischargePassenger();

        PassengerPlane passengerPlane2 = new PassengerPlane("KL757", 100);
        passengerPlane2.boardPassengers(80);
        passengerPlane2.takeOff();
        passengerPlane2.isFlyingStatus();
        passengerPlane2.land();
        passengerPlane2.dischargePassenger();

        Airport airport = new Airport("Schiphol");
        airport.addAirplane(new PassengerPlane("KL945", 70, 95));
        airport.addAirplane(new PassengerPlane("HV315", 80, 65));
        airport.addAirplane(new PassengerPlane("HV811", 55, 60));
        airport.printAirplanes();
        airport.getAvailableAirplane();










//        airport.getAvailableAirplane();


    }
}
