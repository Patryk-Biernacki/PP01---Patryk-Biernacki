package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Courier extends Car implements EntityInterface {

    public Courier(String plate) {
        super(plate);
    }

    public String identify() {
        return "Courier";
    }
}
