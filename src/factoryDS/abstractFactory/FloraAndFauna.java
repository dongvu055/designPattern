package factoryDS.abstractFactory;

import factoryDS.factory.animal.Animal;
import factoryDS.factory.plants.Plants;

public abstract class FloraAndFauna {
    public abstract Animal getAnimal(String type);
    public abstract Plants getPlants(String type);
    public abstract void type();
}
