package structural.bridgeDS;

public class DecorTypeTwo extends DecorType{
    public DecorTypeTwo(String color, String style) {
        super(color, style);
    }

    @Override
    public void type() {
        System.out.println("DecorTypeTwo: color-" + color + " style-"+ style);
    }
}
