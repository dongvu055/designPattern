package structural.bridgeDS;

public abstract class DecorType {
    protected String color;
    protected String style;

    public DecorType(String color,String style){
        this.color = color;
        this.style = style;
    }
    public abstract void type();
}
