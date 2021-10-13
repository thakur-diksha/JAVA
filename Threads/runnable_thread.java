package threads;

class runnable_thread1 implements Runnable {
    Thread t;
    public runnable_thread1(String n){
        t = new Thread(this,n);
        t.start();
    }
    @Override
    public void run(){
        for(int i ='a'; i<'z';i++){
            try{
            System.out.println(t.getName()+":\t"+(char)i);
            Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(t.getName()+ " interrupted");
            }
        }
        System.out.println(t.getName()+"terminated");
    }
}

class runnable_thread2 implements Runnable {
    Thread t;
    public runnable_thread2(String n){
        t = new Thread(this,n);
        t.start();
    }
    @Override
    public void run(){
        for(int i ='a'; i<'z';i++){
            try{
            System.out.println(t.getName()+":\t"+i);
            Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(t.getName()+ " interrupted");
            }
        }
        System.out.println(t.getName()+"terminated");
    }
}
public class runnable_thread{
    public static void main(String args[]){
        runnable_thread1 th1 = new runnable_thread1("Thread one ");
        runnable_thread2 th2 = new runnable_thread2("Thread two ");
        for(int i = 91; i < 95; i++){
            System.out.println(Thread.currentThread().getName()+":\t"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
        System.out.println(Thread.currentThread().getName()+ " terminated");
    }

}

/*run:
Thread one :	a
main:	91
Thread two :	97
Thread one :	b
Thread two :	98
Thread one :	c
Thread two :	99
Thread one :	d
Thread two :	100
Thread one :	e
Thread two :	101
Thread two :	102
Thread one :	f
main:	92
Thread one :	g
Thread two :	103
Thread one :	h
Thread two :	104
Thread two :	105
Thread one :	i
Thread one :	j
Thread two :	106
main:	93
Thread one :	k
Thread two :	107
Thread one :	l
Thread two :	108
Thread two :	109
Thread one :	m
Thread one :	n
Thread two :	110
Thread one :	o
Thread two :	111
main:	94
Thread one :	p
Thread two :	112
Thread one :	q
Thread two :	113
Thread one :	r
Thread two :	114
Thread one :	s
Thread two :	115
Thread two :	116
Thread one :	t
main terminated
Thread one :	u
Thread two :	117
Thread one :	v
Thread two :	118
Thread one :	w
Thread two :	119
Thread one :	x
Thread two :	120
Thread one :	y
Thread two :	121
Thread one terminated
Thread two terminated
BUILD SUCCESSFUL (total time: 5 seconds)*/