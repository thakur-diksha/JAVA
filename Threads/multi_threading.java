package threads;

//2 ways to create thread in java - 1. by creating thread class and 2. by implementing runnable interface(concurrent execution of fns)
//processes - heavy . threads - light. so we multitask within a process
//concurrency: only one task at a time. parallelism- multiple tasks at a time. multithreading helps us achieve concurrency

//creating a thread by extending from thread class
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<10){
          System.out.println("my thread 1 is running");
          System.out.println("ok");
          i++;
        }   
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<5){
          System.out.println("my thread 2 is running");
          System.out.println("okayy");
          i++;
        }   
    }
}

public class multi_threading {

    public static void main(String args[]){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();    // start() method used to start a run. it implements start() method internally. present in thread.java
        t2.start();
    }
}
