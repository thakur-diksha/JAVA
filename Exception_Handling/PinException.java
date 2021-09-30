package exceptions;
//custom exception. pin code should be of 6 digits
import java.util.Scanner;

public class PinException extends Exception{
    static Scanner sc = new Scanner(System.in);
    public PinException(){
        super();
    }
    public PinException(String x){
        super(x);
    }
    
    public static void main(String args[]){
        
        System.out.println("Enter your area pin code/postal code:");
        String pin = sc.next(); 
       
        while(pin.length() != 6){
        try{
            throw new PinCodeException("invalid pin code. enter a 6 digit code only!");    
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"Re-enter your pin:");
            pin = sc.next();
            
        }
      }
    }
}