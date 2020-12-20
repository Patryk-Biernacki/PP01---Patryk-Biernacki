package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Ambulance extends Car implements EntityInterface {
    public Ambulance(String plate) {
        super(plate);
    }

    public String identify() {
        return "Ambulance";
    }
}
