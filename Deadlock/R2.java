package deadlock;

public class R2 {
    synchronized public void first(R1 obj){
        System.out.println("main thread is trying to call R2's second method");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {}
        obj.second();
    }
    synchronized public void second(){
        System.out.println("inside R1's second method");
    }
}

