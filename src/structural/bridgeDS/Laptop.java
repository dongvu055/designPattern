package structural.bridgeDS;

public class Laptop extends Computer{

    public Laptop(DecorType decorType) {
        super(decorType);
    }

    @Override
    public void run() {
        System.out.println("Laptop say Hello");
        decorType.type();
    }
}
