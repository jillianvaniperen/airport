package com.capgemini.airport;

import com.capgemini.airport.airplane.CargoPlane;
import com.capgemini.airport.airplane.PassengerPlane;
import com.capgemini.airport.airplane.Airport;

public class Application {
    public static void main(String[] args) {
//
//        // Passenger planes
//        PassengerPlane passengerPlane1 = new PassengerPlane("KL573", 75);
//        passengerPlane1.boardPassengers(100);
//        passengerPlane1.takeOff();
//        passengerPlane1.land();
//        passengerPlane1.dischargePassenger();
//
//        PassengerPlane passengerPlane2 = new PassengerPlane("KL757", 100);
//        passengerPlane2.boardPassengers(80);
//        passengerPlane2.takeOff();
//        passengerPlane2.isFlyingStatus();
//        passengerPlane2.land();
//        passengerPlane2.dischargePassenger();
//
//        // Cargo planes
//        CargoPlane cargoPlane1 = new CargoPlane("FED881", 0 , 0, 60);
//        CargoPlane cargoPlane2 = new CargoPlane("FED890", 0 , 0, 20);
//
//        cargoPlane1.loadCargo(45);
//        cargoPlane1.unloadCargo();
//        cargoPlane2.loadCargo(30);
//        cargoPlane2.unloadCargo();

        // Airport
        Airport airport = new Airport("Schiphol");

        airport.addPassengerPlane(new PassengerPlane("KL945", 0, 95));
        airport.addPassengerPlane(new PassengerPlane("HV315", 0, 65));
        airport.addPassengerPlane(new PassengerPlane("HV811", 0, 60));

        airport.addCargoPlane(new CargoPlane("FED543", 0, 0, 50));
        airport.addCargoPlane(new CargoPlane("DHL041", 0, 0, 25));

        airport.printPassengerAirplanes();
        airport.printCargoAirplanes();

        PassengerPlane HV315 = airport.findPassengerPlaneByPlaneId("HV315");
        HV315.boardPassengers(115);
        HV315.takeOff();
        HV315.land();
        HV315.dischargePassenger();

        CargoPlane FED543 = airport.findCargoPlaneByPlaneId("FED543");
        FED543.loadCargo(65);
        FED543.takeOff();
        FED543.land();
        FED543.unloadCargo();

    }
}
