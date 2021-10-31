package deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

public class R1 {
    synchronized public void first(R2 obj1){
        System.out.println("t1 thread is trying to call R2's second method");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {}
        obj1.second();
    }
    synchronized public void second(){
        System.out.println("inside R1's second method");
    }
}
