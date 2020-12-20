package Zoo;

public class Plants extends Food{
    public Plants(String name) {
        super(name);
    }

    @Override
    public String getFood() {
        return this.food;
    }
}
