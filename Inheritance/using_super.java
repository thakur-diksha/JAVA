package multilevel_inheritance;

class A{
    int x;
    public A(){
        System.out.println("inside class A");
    }
    public A(int a){
        x = a;
    }
    @Override
    public String toString(){
        return("value:"+x);
    }
}

class B extends A{
    int y;
    public B(){
        System.out.println("inside class B");
    }
    public B(int a, int b){
        super(a);
        y = b;
    }
    @Override
    public String toString(){
        return(super.toString()+"\nvalue:"+y);
    }
}

class C extends B{
    int z;
    public C(){
        System.out.println("inside class C");
    }
     public C(int a, int b, int c){
        super(a,b);
        z = c;
    }
    @Override
    public String toString(){
        return(super.toString()+"\nvalue:"+z);
    }
}
class D extends C{
    int w;
    public D(){
        System.out.println("inside class D");
    }
     public D(int a, int b, int c, int d){
        super(a,b,c);
        w = d;
    }
    @Override
    public String toString(){
        return(super.toString()+"\nvalue:"+w);
    }
}

public class using_super {
    public static void main(String args[]){
        D obj = new D(2,3,4,5);
        System.out.println(obj);
    }
}

/*run:
value:2
value:3
value:4
value:5*/