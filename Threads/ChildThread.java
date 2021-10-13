package threads;

public class ChildThread extends Thread {

    ChildThread(String task) {
        super(task);
        start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            
            try {
                System.out.println(this.getName()+":\t"+ i);
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {
                System.out.println(this.getName()+"interrupted");
            }
        } 
    } 

    public static void main(String[] args) {
        ChildThread t1 = new ChildThread("Cook");
        ChildThread t2 = new ChildThread("watch tv");
        ChildThread t3 = new ChildThread("play games");
        
        for(int i = 10; i<15; i++){
            System.out.println(Thread.currentThread().getName()+":\t"+i);
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException ex){
                System.out.println(Thread.currentThread().getName()+"interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName()+"terminated");
    }
}

/*run:
main:	10
play games:	1
watch tv:	1
Cook:	1
watch tv:	2
Cook:	2
play games:	2
main:	11
watch tv:	3
play games:	3
Cook:	3
play games:	4
main:	12
watch tv:	4
Cook:	4
Cook:	5
play games:	5
watch tv:	5
main:	13
main:	14
mainterminated */
