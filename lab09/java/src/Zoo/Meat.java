package Zoo;

public class Meat extends Food {


    public Meat(String name) {
        super(name);
    }

    @Override
    public String getFood() {
        return this.food;
    }
}
