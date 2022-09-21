package creational.factoryDS.factory.animal;

import creational.factoryDS.abstractFactory.FloraAndFauna;
import creational.factoryDS.factory.plants.Plants;

public class AnimalFactory extends FloraAndFauna {
    @Override
    public Plants getPlants(String type) {
        return null;
    }

    @Override
    public Animal getAnimal(String type) {
        if ("DOG".equalsIgnoreCase(type)) {
            return new Dog();
        }

        if ("CAT".equalsIgnoreCase(type)) {
            return new Cat();
        }

        return null;
    }

    @Override
    public void type() {
        System.out.println("AnimalFactory");
    }
}
