package inheritance;

class A{
    public A(){
        System.out.println("A class const invoked");
    }
 }

class B extends A{
    public B(){
        System.out.println("B class const invoked");
    }
 }

class C extends B{
    public C(){
        System.out.println("C class const invoked");
    }
 }

class D extends C{
    public D(){
        System.out.println("D class const invoked");
    }
 }

public class multilevel_inheritance {

    public static void main(String args[]) {
           D obj = new D();                        // only deafault const are invoked this way. to invoke parametrized const, we need to use super
    }
}

/*run:
A class const invoked
B class const invoked
C class const invoked
D class const invoked
BUILD SUCCESSFUL (total time: 0 seconds)*/