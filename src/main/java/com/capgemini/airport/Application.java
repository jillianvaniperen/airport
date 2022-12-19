package com.capgemini.airport;

import com.capgemini.airport.airplane.Airplane;

public class Application {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("KL573", 75);
        airplane1.boardPassengers(40);
        airplane1.boardPassengers(40);
        airplane1.takeOff();
        airplane1.land();
        airplane1.dischargePassenger();

        Airplane airplane2 = new Airplane("KL757", 100);
        airplane2.boardPassengers(80);
        airplane2.takeOff();
        airplane2.checkFlyingStatus();
        airplane2.land();
        airplane2.dischargePassenger();




    }
}
