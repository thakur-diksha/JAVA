package methods;

import java.util.Scanner;

public class factorial_using_fn {

    public static void main(String args[]) {

        int fact = factorial();
        System.out.println("factorial =" + fact);
    }

    static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x:");
        int x = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= x; i++) 
            fact = fact * i;
        
        return fact;
    }
}
