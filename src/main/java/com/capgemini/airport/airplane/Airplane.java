package com.capgemini.airport.airplane;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private String planeIdentification;
    private int maxPassengers;
    private int currentPassengers;
    private boolean flyingStatus;
    private int cruiseSpeed;
    // private ArrayList<Passenger> passengers = new ArrayList<>();

    public Airplane() {
    }

    public Airplane(String planeIdentification, int maxPassengers) {
        this.planeIdentification = planeIdentification;
        this.maxPassengers = maxPassengers;
    }

    public void boardingPassengers(int currentPassengers) {
        if (currentPassengers >= maxPassengers) {
            int overloadPassengers = currentPassengers - maxPassengers;
            this.currentPassengers = currentPassengers - overloadPassengers;
            System.out.println("Maximum capacity is reached for plane " + planeIdentification + ". " + overloadPassengers + " passengers can not board.");
        } else {
            this.currentPassengers = currentPassengers;
        }
    }

    public void dischargePassenger() {
        currentPassengers = currentPassengers;
    }

    public void checkFlyingStatus(boolean flyingStatus) {
        this.flyingStatus = flyingStatus;
        if (flyingStatus = true) {
            System.out.println("Plane is already in the air");
        } else {
            System.out.println("Ready for take off");
        }
    }

    public void takeOff() {
        System.out.println("The plane took off");
    }

    public void land() {
        System.out.println("The plane has landed");
    }

    @Override
    public String toString() {
        return "Airplane " + planeIdentification + " boards " + currentPassengers + " passengers.\n"
                + "Airplane " + planeIdentification + " takes off.\n"
                + "Airplane " + planeIdentification + " lands.\n"
                + "Airplane " + planeIdentification + " discharges " + currentPassengers + " passengers.\n";
    }
}


//    public boolean boardPassenger(Passenger passenger) {
//        if (passengers.size() == maxPassengers) {
//            System.out.println("Max capacity reached. Ready for take off");
//            return false;
//        } else {
//            this.passengers.add(passenger);
//            passenger.toString().length();
//            return true;
//        }
//    }






