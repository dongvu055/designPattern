package structural.bridgeDS;

public class DecorTypeOne extends DecorType {
    public DecorTypeOne(String color, String style) {
        super(color, style);
    }

    @Override
    public void type() {
        System.out.println("DecorTypeOne: color-" + color + " style-" + style);
    }
}
