package Zoo.Animals;

import Zoo.Food;

public class Rekin extends Animal{
    Rekin(String name) {
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
