/* create two threads. t1 thread will print 1 to 50 numbers and main thread will print a to z characters. 
t1 thread will pause after printing 1 to 20 number, after this main thread will print a to k characters and will 
pause until t1 thread finished.
*/

package interthreadcommunication;
import java.util.logging.Level;
import java.util.logging.Logger;

class print{
    boolean busy=true;
    int n;
    char c;
    synchronized public void numbers (int i){
        try{
            if(!busy){
                wait();
            }
        }
        catch(InterruptedException ex){
            System.out.println("An interrupt occur");
        }
        i++;
        System.out.print(i+" ");
        if(i==20 || i==50){
            System.out.println("");
            busy=false;
            notify();    
        }
    }
 
    synchronized public void alphabets (int j){
        try{
            if(busy){
                wait();
            }
        }
        catch(InterruptedException ex){
            System.out.println("An interrupt occur");
        }
        
        while(c<='z' && !busy){
            System.out.print(c+" ");
            
            if(c=='k' || c=='z'){
                System.out.println("");
                busy=true;
                notify();
            }  
            c++;
        }
    }
}

class print_num extends Thread{
    print p;
    public print_num(print p){
        this.p=p;
        start();
    }
    @Override
    public void run(){
        for(int i=0;i<50;i++)
        {
            p.numbers(i);
        }
    }
}
class print_alpha extends Thread{
    print p;
    public print_alpha(print p){
        this.p=p;
        start();
    }
    @Override
    public void run(){
        p.c='a';
        for(int i=1;i<=2;i++)
        {
            p.alphabets(i);
        }
    }
}
public class Numbers_alphabets_thread {
    public static void main (String args[]){
        print p =new print();
        print_num pn=new print_num(p);
        print_alpha pa=new print_alpha(p);
    }
}

/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
a b c d e f g h i j k 
21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 
l m n o p q r s t u v w x y z 
*/
