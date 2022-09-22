package structural.bridgeDS;

public class Desktop extends Computer {
    public Desktop(DecorType decorType) {
        super(decorType);
    }

    @Override
    public void run() {
        System.out.println("Desktop say hello");
        decorType.type();
    }
}


