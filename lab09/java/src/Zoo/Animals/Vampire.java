package Zoo.Animals;

import Zoo.Food;

public class Vampire extends Animal{
    Vampire(String name) {
        super(name);
    }

    @Override
    public Food[] getDiet() {
        return new Food[0];
    }

    @Override
    public int getHour() {
        return 0;
    }
}
