package Zoo;

abstract public class Food {

    String food;

    public Food(String name) {
        this.food = name;
    }

    abstract public String getFood();

}
