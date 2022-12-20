package com.capgemini.airport.airplane;

public class CargoPlane extends AirPlane {
    private int maxCargo;
    private int currentCargo;

    public CargoPlane(String planeIdentification, int cruiseSpeed, int maxCargo) {
        super(planeIdentification,cruiseSpeed);
        this.maxCargo = maxCargo;
    }

    public void loadCargo(int maxCargo) {

    }

    public void unloadCargo() {

    }

    public boolean checkCargo() {
        return false;
    }

    public boolean checkTemperature() {
        return false;
    }
}
