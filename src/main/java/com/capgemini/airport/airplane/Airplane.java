package com.capgemini.airport.airplane;

public class Airplane {
    private final static int DEFAULT_AMOUNT_PASSENGERS = 0;
    private final static boolean DEFAULT_FLYING_STATUS = false;

    private String planeIdentification;
    private int maxPassengers;
    private int currentPassengers;
    private boolean isFlying;
    private int cruiseSpeed;

    public Airplane() {
    }

    public Airplane(String planeIdentification, int maxPassengers, int currentPassengers, boolean isFlying, int cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.maxPassengers = maxPassengers;
        this.currentPassengers = DEFAULT_AMOUNT_PASSENGERS;
        this.isFlying = DEFAULT_FLYING_STATUS;
        this.cruiseSpeed = 0;
    }

    public Airplane(String planeIdentification, int maxPassengers) {
        // attributen zonder input parameter (defaults)
        this.currentPassengers = DEFAULT_AMOUNT_PASSENGERS;
        this.isFlying = DEFAULT_FLYING_STATUS;
        this.cruiseSpeed = 0;

        // attributen die je on-the-spot wilt vullen tijdens aanmaken object
        this.planeIdentification = planeIdentification;
        this.maxPassengers = maxPassengers;

    }

    public void boardPassengers(int boardPassengers) {
        // check if current passengers plus boarding passengers would exceed the maximum passengers
        int amountPassengers = boardPassengers + currentPassengers;
        if (amountPassengers > maxPassengers) {
            // some passengers might not fit in plane
            int overloadPassengers = amountPassengers - maxPassengers;
            this.currentPassengers += (boardPassengers - overloadPassengers);
            System.out.println(planeIdentification + " boards " + maxPassengers + " passengers, " + overloadPassengers + " can not be seated.");
        } else {
            // passengers fit in plane
            this.currentPassengers += boardPassengers;
            System.out.println(planeIdentification + " boards " + currentPassengers + " passengers.");
        }
    }

    public void dischargePassenger() {
        currentPassengers = currentPassengers;
        System.out.println(planeIdentification + " discharges " + currentPassengers + " passengers.\n");
    }

    public void isFlyingStatus() {
        if (this.isFlying == true) {
            System.out.println("Plane is flying");
        } else {
            System.out.println("Plane is not flying");
        }
    }

    public void takeOff() {
        if (this.isFlying == true) {
            // is flying
            System.out.println(planeIdentification + " can not take off, because we are already flying");
        } else {
            // is not flying
            this.isFlying = true;
            // is now flying
            System.out.println(planeIdentification + " has taken off!");
        }
    }

    public void land() {
        if (this.isFlying == false) {
            // is not flying
            System.out.println("Plane already landed");
        } else {
            // is flying
            this.isFlying = false;
            // is landed
            System.out.println("The plane has landed");
        }
    }

    @Override
    public String toString() {
        return planeIdentification;
    }
}












