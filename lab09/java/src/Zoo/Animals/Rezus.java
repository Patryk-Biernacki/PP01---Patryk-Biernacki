package Zoo.Animals;

import Zoo.Animals.Animal;
import Zoo.Food;
import Zoo.Meat;
import Zoo.Plants;

public class Rezus extends Animal {

    public Rezus(String name) {
        super(name);
    }

    @Override
    public Food[] getDiet() {
        return new Food[]{new Meat("red meat"), new Meat("white meat"), new Plants("grass")};
    }

    @Override
    public int getHour() {
        return 8;
    }

}
