package basic_applications;

import java.util.Scanner;

public class Comp_Interest {
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       float p, r, t, n;
       System.out.println("Enter principal:");
       p = input.nextFloat();
       
       System.out.println("Enter rate:");
       r = input.nextFloat();
       
       System.out.println("Enter time:");
       t = input.nextFloat();
       
       System.out.println("Enter no of times interest is compounded:");
       n = input.nextFloat();
       
       double ci = p* (Math.pow((1+r/100), (t*n)))-p;
       
       System.out.println("Compound interest is:"+ci);
        
    }
}


