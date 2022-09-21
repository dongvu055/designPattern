package factoryDS.abstractFactory;

import factoryDS.factory.animal.AnimalFactory;
import factoryDS.factory.plants.PlantsFactory;

public class AbstractFactory {
    public FloraAndFauna getFactory(String type) {
        if ("Animal".equalsIgnoreCase(type)) return new AnimalFactory();

        if ("Plants".equalsIgnoreCase(type)) return new PlantsFactory();

        return null;
    }
}
