package kendiExceptionClassOlusturma;

import java.io.IOException;

public class IncalidAgeException  extends IOException {

    public IncalidAgeException (String message){
        super(message);
    }
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir IncelidAge Exception hatasıdır.");
    }
}
