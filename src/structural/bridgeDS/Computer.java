package structural.bridgeDS;

public abstract class Computer {
    protected DecorType decorType;
    public Computer(DecorType decorType){
        this.decorType = decorType;
    }
    public abstract void run();
}
