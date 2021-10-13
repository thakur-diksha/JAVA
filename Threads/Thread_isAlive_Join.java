package threads; 
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread_isAlive_Join implements Runnable{
    Thread t;
    public Thread_isAlive_Join(String n){
        t=new Thread(this,n);
        t.start();
    }
    @Override
    public void run(){
        for(int i='A';i<'F';i++)
        {
            try{
                System.out.println(t.getName()+":\t"+(char)i);
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                System.out.println(t.getName()+"interrupted");
            }
        }
        System.out.println(t.getName()+"terminated");
    }
    public static void main(String args[]){
        Thread_isAlive_Join t1 = new Thread_isAlive_Join("First Thread"); 
        Thread_isAlive_Join t2 = new Thread_isAlive_Join("Second Thread"); 
        Thread_isAlive_Join t3 = new Thread_isAlive_Join("Third Thread"); 
        System.out.println(t1.t.getName()+" is alive: "+t1.t.isAlive());
        System.out.println(t2.t.getName()+" is alive: "+t2.t.isAlive());
        System.out.println(t3.t.getName()+" is alive: "+t3.t.isAlive());
        for(int i=50;i<56;i++){
            System.out.println(Thread.currentThread().getName()+":\t"+i);
            try{
                t1.t.join();
                t2.t.join();
//              t3.t.join();
            }
            catch(InterruptedException e){
                Logger.getLogger(ThreadRunnable.class.getName()).log(Level.SEVERE,null,e);
            }
            System.out.println(t1.t.getName()+" is alive: "+t1.t.isAlive());
            System.out.println(t2.t.getName()+" is alive: "+t2.t.isAlive());
            System.out.println(t3.t.getName()+" is alive: "+t3.t.isAlive());
        System.out.println(Thread.currentThread().getName()+" terminated");
       }
    }
}

/*run:
First Thread is alive: true
Third Thread:	A
Second Thread:	A
First Thread:	A
Second Thread is alive: true
Third Thread is alive: true
main:	50
Second Thread:	B
First Thread:	B
Third Thread:	B
Second Thread:	C
First Thread:	C
Third Thread:	C
Second Thread:	D
First Thread:	D
Third Thread:	D
Third Thread:	E
Second Thread:	E
First Thread:	E
First Threadterminated
Third Threadterminated
Second Threadterminated
First Thread is alive: false
Second Thread is alive: false
Third Thread is alive: false
main terminated
main:	51
First Thread is alive: false
Second Thread is alive: false
Third Thread is alive: false
main terminated
main:	52
First Thread is alive: false
Second Thread is alive: false
Third Thread is alive: false
main terminated
main:	53
First Thread is alive: false
Second Thread is alive: false
Third Thread is alive: false
main terminated
main:	54
First Thread is alive: false
Second Thread is alive: false
Third Thread is alive: false
main terminated
main:	55
First Thread is alive: false
Second Thread is alive: false
Third Thread is alive: false
main terminated
BUILD SUCCESSFUL (total time: 1 second)*/