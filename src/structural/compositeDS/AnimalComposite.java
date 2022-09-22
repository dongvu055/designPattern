package structural.compositeDS;

import java.util.ArrayList;
import java.util.List;

public class AnimalComposite implements AnimalComponent {
    List<AnimalComponent> animalComponents = new ArrayList<>();

    @Override
    public void animalType() {
        animalComponents.forEach(animalComponent -> {
            animalComponent.animalType();
        });
    }

    public void add(AnimalComponent animalComponent){
        animalComponents.add(animalComponent);
    }

    public void addAll(List<AnimalComponent> animalComponent){
        animalComponents.addAll(animalComponent);
    }

    public void remove(AnimalComponent animalComponent){
        animalComponents.remove(animalComponent);
    }
}
