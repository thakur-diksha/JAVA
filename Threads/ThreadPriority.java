package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPriority implements Runnable {
    public Thread t;
    public int click = 0;
    volatile boolean running = true;
    public ThreadPriority(String name, int pri){
        t =  new Thread(this, name);
        t.setPriority(pri);
        
    }
    @Override
    public void run(){
        while(running)
            click++;
    }
    public void start(){
        t.start();
    }
    public void stop(){
        running = false;
    }
} 
class TestPriority{
    public static void main(String args[]){
//       ThreadPriority high = new ThreadPriority("High", Thread.MIN_PRIORITY);
//       ThreadPriority low = new ThreadPriority("Low", Thread.MAX_PRIORITY);
        ThreadPriority high = new ThreadPriority("High", Thread.MAX_PRIORITY);
       ThreadPriority low = new ThreadPriority("Low", Thread.MIN_PRIORITY);
       high.start();
       low.start();
       System.out.println("both threads have been started. wait for 2 seconds");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestPriority.class.getName()).log(Level.SEVERE, null, ex);
        }
//        low.stop();
//        high.stop();
        high.stop();
        low.stop();
        System.out.println("high clicks are: "+high.click);
        System.out.println("low clicks are: "+low.click);
    }
}

/*run:
(HIGH = MIN, LOW = MAX)
both threads have been started. wait for 2 seconds
high clicks are: 146331711  
low clicks are: 507756104
BUILD SUCCESSFUL (total time: 5 seconds)

run:
(HIGH = MAX, LOW = MIN)
both threads have been started. wait for 2 seconds
high clicks are: 493057383
low clicks are: 242054149
BUILD SUCCESSFUL (total time: 3 seconds)*/