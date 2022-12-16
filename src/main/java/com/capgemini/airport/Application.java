package com.capgemini.airport;

import com.capgemini.airport.airplane.Airplane;
import com.capgemini.airport.airplane.Passenger;

public class Application {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("KL573", 75);
        airplane1.boardingPassengers(80);
        airplane1.dischargePassenger();
        airplane1.checkFlyingStatus(true);
        System.out.println(airplane1);

        Airplane airplane2 = new Airplane("KL757", 100);
        airplane2.boardingPassengers(80);
        airplane2.dischargePassenger();
        airplane2.checkFlyingStatus(false);
        System.out.println(airplane2);

    }
}
