import ParkingLotManager.Interfaces.EntityInterface;
import ParkingLotManager.Log;
import ParkingLotManager.ParkingLot;
import ParkingLotManager.QueueGenerator;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<EntityInterface> queue = new ArrayList<>();
        QueueGenerator generator  = new QueueGenerator(5, 2, 0,0, 0, 0, 0,2);
        queue = generator.generate();

        ParkingLot parking = new ParkingLot();

        Log.info("There's " + parking.countCars() + " cars in the parking lot");
        Log.info();

        String[] godziny = {"05:00", "15:00", "23:00"};

        for(int i=0; i<godziny.length; i++) {
            for (EntityInterface entity : queue) {
                if (parking.checkIfCanEnter(entity)) {
                    System.out.print(godziny[i]+" - ");
                    parking.letIn(entity);
                }
            }
        }

        Log.info();
        Log.info("There's " + parking.countCars() + " cars in the parking lot");
        Log.info("Money: "+parking.zarobiona_kwota());
    }
}
