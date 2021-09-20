package interfacesjava;

public interface Scientific_Calc {
    float PI=3.14f;
    void add(float a, float b);
    void sub(float a, float b);
    void mult(float a, float b);
    void div(float a, float b);
    void mod(float a, float b);
    void sqrt(float a);
    void log(float a);
    void pow(float a, float b);
    void sin(float a);
    void toRadians(float a);
}

class casio1 implements Scientific_Calc{
    
    public casio1(){}
    
    @Override
    public void add(float a, float b){
        
        float sum = a+b;
        System.out.println("Summation is:"+sum);
    }
    
    @Override
    public void sub(float a, float b){
        
        float sub = a-b;
        System.out.println("Subtraction is:"+sub);
    }
    
    
    @Override
    public void mult(float a, float b){
        
        float m = a*b;
        System.out.println("Multiplication is:"+m);
    }
    
    @Override
    public void mod(float a, float b){
       
        float r = a%b;
        System.out.println("Modulus is:"+r);
    }
    
    @Override
    public void div(float a, float b){
        float div = a/b;
        System.out.println("Division is:"+div);
    }
    
    @Override
    public void sqrt(float a){
        System.out.println("Square root is:"+Math.sqrt(a));
        
    }
    
    @Override
    public void log(float a){
        System.out.println("Logarithm is:"+Math.log(a));
        
    }
    
    @Override
    public void pow(float a, float b){
        System.out.println("Power a raised to be is:"+Math.pow(a,b));
    }
    
    @Override
    public void sin(float a){
        System.out.println("Sine value is:"+Math.sin(a));
    }
    
    @Override
    public void toRadians(float a){
        System.out.println("Radian value of the given degree is:"+Math.toRadians(a));
    }
}


class test{
    public static void main(String args[]) {
        Scientific_Calc c = new casio1();
        c.add(5,4);
        c.sub(4, 3);
        c.sub(67, 98);
        c.mult(12, 7);
        c.mod(13, 2);
        c.div(131, 4);
        c.sqrt(121);
        c.log(1312);
        c.pow(12, 2);
        c.sin(30);
        c.toRadians(30);
    }
    
}
