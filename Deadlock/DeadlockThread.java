package deadlock;

public class DeadlockThread extends Thread{
    R1 obj = new R1();
    R2 obj1 = new R2();
    DeadlockThread(){
        start();
        obj1.first(obj);
    }
    @Override
    public void run(){
        obj.first(obj1);
    }

    public static void main(String[] args) {
        DeadlockThread t1 = new DeadlockThread();
    }
}

/*Deadlock raised

run:
main thread is trying to call R2's second method
t1 thread is trying to call R2's second method
*/