package Zoo.Animals;

import Zoo.Food;
import Zoo.Meat;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public Food[] getDiet() {
        return new Food[]{new Meat("red meat"), new Meat("white meat")};
    }

    @Override
    public int getHour() {
        return 8;
    }

}
