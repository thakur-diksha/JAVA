package exceptions;
import java.util.Scanner;
public class dimension_exception extends Exception{
        
        static Scanner sc = new Scanner(System.in);
        public dimension_exception(){
        super();
        }
        public dimension_exception(String x){
        super(x);
        }
    
    public static int AreaSq(int x) throws dimension_exception{
        if(x <0 || x == 0){
            throw new dimension_exception("dimension cannot be negative or zero!");
        }
        int area = x*x;
        return area;
    }
    
    public static void main(String args[]){ 
        try{
            System.out.println("enter dimesnsion: ");
            int side = sc.nextInt();  
            System.out.println("area is: " + AreaSq(side));
        }   
        catch(Exception e){
            System.out.println(e.getMessage());   
        }    
    }    
}

