package creational.factoryDS.factory.plants;

import creational.factoryDS.abstractFactory.FloraAndFauna;
import creational.factoryDS.factory.animal.Animal;

public class PlantsFactory extends FloraAndFauna {
    @Override
    public Animal getAnimal(String type) {
        return null;
    }

    @Override
    public Plants getPlants(String type) {
        if ("VEGETABLE".equalsIgnoreCase(type))
            return new Vegetable();

        if ("WEED".equalsIgnoreCase(type))
            return new Weed();

        return new Flower();
    }

    @Override
    public void type() {
        System.out.println("PlantsFactory");
    }
}
