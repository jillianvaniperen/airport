package com.capgemini.airport.airplane;

public class AirPlane {
    private final boolean DEFAULT_FLYING_STATUS = false;
    private String airplaneIdentification;
    private int cruiseSpeed;
    private boolean isFlying;

    public AirPlane(String airplaneIdentification, int cruiseSpeed) {
        this.airplaneIdentification = airplaneIdentification;
        this.cruiseSpeed = cruiseSpeed;
        this.isFlying = DEFAULT_FLYING_STATUS;
    }

    public AirPlane() {
    }

    public String getAirplaneIdentification() {
        return airplaneIdentification;
    }

    public void takeOff() {
        if (this.isFlying == true) {
            // is flying
            System.out.println(airplaneIdentification + " can not take off, because we are already flying");
        } else {
            // is not flying
            this.isFlying = true;
            // is now flying
            System.out.println(airplaneIdentification + " has taken off!");
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
}
