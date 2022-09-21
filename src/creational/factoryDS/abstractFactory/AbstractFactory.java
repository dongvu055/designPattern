package creational.factoryDS.abstractFactory;

import creational.factoryDS.factory.animal.AnimalFactory;
import creational.factoryDS.factory.plants.PlantsFactory;

public class AbstractFactory {
    public FloraAndFauna getFactory(String type) {
        if ("Animal".equalsIgnoreCase(type)) return new AnimalFactory();

        if ("Plants".equalsIgnoreCase(type)) return new PlantsFactory();

        return null;
    }
}
