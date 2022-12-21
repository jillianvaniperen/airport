package com.capgemini.airport.airplane;

public class CargoPlane extends Airplane {
    private int maxCargo;
    private int currentCargo;

    public CargoPlane(String planeIdentification, int cruiseSpeed, int currentCargo, int maxCargo) {
        super(planeIdentification,cruiseSpeed);
        this.maxCargo = maxCargo;
        this.currentCargo = currentCargo;
    }

    public void loadCargo(int boardCargo) {
        // check if current cargo plus cargoLoad would exceed the maximum cargo.
        int amountCargo = boardCargo + currentCargo;
        if (amountCargo > maxCargo) {
            int overloadCargo = amountCargo - maxCargo;
            this.currentCargo += (boardCargo - overloadCargo);
            System.out.println(getPlaneIdentification() + " has a freight capacity of " + maxCargo + " tons, " + overloadCargo
                    + " tons can not be stored due to overcapacity.");
        } else {
            this.currentCargo += boardCargo;
            System.out.println(getPlaneIdentification() + " has a freight capacity of " + currentCargo + " tons");
        }
    }

    public void unloadCargo() {
        this.currentCargo = currentCargo;
        System.out.println(getPlaneIdentification() + " unloads " + currentCargo + " tons of cargo\n");
    }

    public boolean checkCargo() {
        if (currentCargo < maxCargo) {
            return true;
        } else {
            return false;
        }
    }

    public int availableFreightSpace() {
        int availableFreightSpace = maxCargo - currentCargo;
        return availableFreightSpace;
    }

    public boolean isAvailable() {
        if (this.checkCargo()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTemperature() {
        return false;
    }

    @Override
    public String toString() {
        return getPlaneIdentification();
    }
}
