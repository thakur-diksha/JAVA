package threads;

class NumbersThread implements Runnable{
    @Override
    public void run(){
        for(int i =1; i<=10; i++)
            System.out.println(i);
              try{
                  Thread.sleep(2000);
              } catch(InterruptedException e){}
                 
    }
}

class AlphabetsThread implements Runnable{
    @Override
    public void run(){
        for(char i ='a'; i<='z'; i++)
            System.out.println(i);
              try{
                  Thread.sleep(1000);
              } catch(InterruptedException e){}
    }
}

public class Nos_alphabets_using_thread {
    public static void main(String args[]){
        NumbersThread t1 = new NumbersThread(); 
        Thread th1 = new Thread(t1); 
        AlphabetsThread t2 = new AlphabetsThread();
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}

/*run:
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z
1
2
3
4
5
6
7
8
9
10
BUILD SUCCESSFUL (total time: 2 seconds)*/
