package exceptions;
import java.io.IOException;
import java.util.Scanner;

public class chained_exception {
    public static void divide(int a, int b){
        if(b == 0){
            ArithmeticException e = new ArithmeticException("top layer");
            e.initCause(new IOException("cause"));
            throw e;
        }
        else{
            System.out.println(a/b);
        }
    }

    public static void main(String[] args){
        try{
            int a = 5;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter b here: ");
            int b = sc.nextInt();
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println( "caught : " +e);
            System.out.println("actual cause: "+e.getCause());
        }
    }
}

