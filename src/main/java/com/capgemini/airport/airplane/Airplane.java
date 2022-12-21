package com.capgemini.airport.airplane;

public class Airplane {
    private final boolean DEFAULT_FLYING_STATUS = false;
    private String planeIdentification;
    private int cruiseSpeed;
    private boolean isFlying;

    public Airplane(String planeIdentification, int cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.cruiseSpeed = cruiseSpeed;
        this.isFlying = DEFAULT_FLYING_STATUS;
    }

    public Airplane(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public String getPlaneIdentification() {
        return planeIdentification;
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
