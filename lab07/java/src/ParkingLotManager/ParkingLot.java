package ParkingLotManager;

import ParkingLotManager.Entities.*;
import ParkingLotManager.Interfaces.EntityInterface;

import java.util.ArrayList;
import java.util.TimerTask;

final public class ParkingLot {

    private ArrayList<EntityInterface> entitiesOnProperty = new ArrayList<>();
    private int miejsca_parkingowe = 10;
    private int miejsca_na_rowery = 10;
    private int zarobek = 0;
    private int carsOnProperty = 0;
    private int bicyclesOnProperty = 0;
    private String[] czarna_lista = {"FZA 2016", "DLX 1000"};


    public boolean checkIfCanEnter(EntityInterface entity) {

        for(int i=0; i<czarna_lista.length; i++) {
            if(entity instanceof Car) {
                if(((Car) entity).plate()==(czarna_lista[i]))
                    return false;
            }
        }

        if(entity instanceof Car &&
                (entity instanceof TeacherCar) == false &&
                (entity instanceof Courier) == false &&
                (entity instanceof Ambulance) == false &&
                carsOnProperty>=miejsca_parkingowe)

            return false;
        if(entity instanceof Bicycle && bicyclesOnProperty>miejsca_na_rowery)
            return false;

        return entity.canEnter();
    }

    public void letIn(EntityInterface entity) {
        entitiesOnProperty.add(entity);
        Log.info(entity.identify() + " let in.");

        if(entity instanceof Car &&
                (entity instanceof TeacherCar) == false &&
                (entity instanceof Courier) == false &&
                (entity instanceof Ambulance) == false) {
            carsOnProperty++;
            zarobek+=5;
        }
        if(entity instanceof Bicycle)
            bicyclesOnProperty++;
    }

    public int zarobiona_kwota() {
        return zarobek;
    }

    public int countCars() {
        return carsOnProperty;
    }

}
