//get and handle current thread object
package threads;

public class Threads {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();    //thread class
        System.out.println(t);
        t.setName("my current Thread");
        t.setPriority(7);
        System.out.println(t);
        for (int i = 5; i > 0; i--) {
            System.out.println(t + "=" + i);
            try {
                Thread.sleep(1000);   //stop execution for 1000ms,i.e, 1 sec
            } 
            catch (InterruptedException e) {
            }
        }
    }
}
/*run:
 Thread[main,5,main]
 Thread[my current Thread,7,main]
 Thread[my current Thread,7,main]=5
 Thread[my current Thread,7,main]=4
 Thread[my current Thread,7,main]=3
 Thread[my current Thread,7,main]=2
 Thread[my current Thread,7,main]=1
 BUILD SUCCESSFUL (total time: 6 seconds)
 */
