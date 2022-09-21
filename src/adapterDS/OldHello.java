package adapterDS;

public class OldHello implements OldObject{
    @Override
    public void sayHello(Integer a) {
        System.out.println("Hello:" + a);
    }
}
