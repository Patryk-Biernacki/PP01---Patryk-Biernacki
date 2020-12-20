package ParkingLotManager;

import ParkingLotManager.Entities.*;
import ParkingLotManager.Interfaces.EntityInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QueueGenerator {

    private int ANONYMOUS_PEDESTRIANS_COUNT = 50;
    private int PEDESTRIANS_COUNT = 5;
    private int CARS_COUNT = 30;
    private int TEACHER_CARS_COUNT = 7;
    private int BICYCLES_COUNT = 3;
    private int tank = 0;
    private int ambulance = 0;
    private int courier = 0;

    public QueueGenerator(int anonim, int pedestrian, int car, int teacherCar, int bicycle, int tank, int ambulance, int courier) {

        ANONYMOUS_PEDESTRIANS_COUNT = anonim;
        PEDESTRIANS_COUNT = pedestrian;
        CARS_COUNT = car;
        TEACHER_CARS_COUNT = teacherCar;
        BICYCLES_COUNT = bicycle;
        this.tank = tank;
        this.ambulance = ambulance;
        this.courier = courier;
    }

    public ArrayList<EntityInterface> generate() {
        ArrayList<EntityInterface> queue = new ArrayList<>();

        for (int i = 0; i <= ANONYMOUS_PEDESTRIANS_COUNT; i++) {
            queue.add(new Pedestrian());
        }

        for (int i = 0; i <= PEDESTRIANS_COUNT; i++) {
            queue.add(new Pedestrian(getRandomName()));
        }

        for (int i = 0; i <= CARS_COUNT; i++) {
            queue.add(new Car(getRandomPlateNumber()));
        }

        for (int i = 0; i <= TEACHER_CARS_COUNT; i++) {
            queue.add(new TeacherCar(getRandomPlateNumber()));
        }

        for (int i = 0; i <= BICYCLES_COUNT; i++) {
            queue.add(new Bicycle());
        }

        for (int i = 0; i <= courier; i++) {
            queue.add(new Courier(getRandomPlateNumber()));
        }

        for (int i = 0; i <= ambulance; i++) {
            queue.add(new Ambulance(getRandomPlateNumber()));
        }

        for (int i = 0; i <= tank; i++) {
            queue.add(new Tank());
        }

        Collections.shuffle(queue);

        return queue;
    }

    private static String getRandomPlateNumber() {
        Random generator = new Random();
        return "DLX " + (generator.nextInt(89999) + 10000);
    }

    private static String getRandomName() {
        String[] names = {"John", "Jack", "James", "George", "Joe", "Jim"};
        return names[(int) (Math.random() * names.length)];
    }

}
