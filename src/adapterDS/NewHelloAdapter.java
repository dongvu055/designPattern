package adapterDS;

import java.util.Objects;

public class NewHelloAdapter implements NewObject {
    private OldObject oldObject;

    public NewHelloAdapter(OldObject oldObject) {
        this.oldObject = oldObject;
    }

    @Override
    public void sayXinchao(String a) {
        Integer convertToMatch;
        try {
            convertToMatch = Integer.parseInt(a);
        }catch (Exception e){
            convertToMatch = 0;
        }
        oldObject.sayHello(convertToMatch);
    }
}
