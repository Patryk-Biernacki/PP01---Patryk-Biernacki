package Zoo.Animals;

import Zoo.Food;
import Zoo.Meat;
import Zoo.Plants;

public class Penguin extends Animal {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public Food[] getDiet() {
        return new Food[]{new Plants("grass")};
    }

    @Override
    public int getHour() {
        return 9;
    }

}
