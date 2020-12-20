import Zoo.Animals.Elephant;
import Zoo.Animals.Lion;
import Zoo.Zoo;
import Zoo.Meat;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Legnica");

        zoo.addAnimal(new Lion("Simba"))
            .addAnimal(new Lion("Mufasa"))
            .addAnimal(new Elephant("Dumbo"));

        int harmonogram[] = {8, 9, 12};

        zoo.feedAnimals(new Meat("red meat"), harmonogram[0]);
        zoo.feedAnimals(new Meat("white meat"), harmonogram[1]);
        zoo.feedAnimals(new Meat("grass"), harmonogram[2]);

    }
}
