package Zoo.Animals;

import Zoo.Food;
import Zoo.Meat;
import Zoo.Plants;

public class Monkey extends Animal {

    public Monkey(String name) {
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
