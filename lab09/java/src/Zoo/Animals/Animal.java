package Zoo.Animals;

import Zoo.Food;
import Zoo.Log;

import java.util.Arrays;

abstract public class Animal {

    private String name;
    private boolean hungry = true;
    protected String hour;

    Animal(String name) {
        this.name = name;
    }

    abstract public Food[] getDiet();
    public abstract int getHour();

    public void feed(Food food, int hour) throws Exception {

        int eat = 0;

        for(int i=0; i<getDiet().length; i++) {
            if(getDiet()[i].getFood().equals(food.getFood()))
                eat +=1;
        }

        if(eat==0||getHour()!=hour) {
            throw new Exception(getName() + " doesn't eat " + food.getFood() + ".");
        }

        hungry = true;
        Log.info(getName() + " fed.");
    }

    public String getName() {
        return getSpecies() + " " + name;
    }

    private String getSpecies() {
        return getClass().getSimpleName();
    }

}
