package basic_applications;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String args[]) {
       
        int n, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        n = sc.nextInt();
        while (n > 0) {  
            digit = n % 10;
            sum = sum + digit; 
            n = n / 10;
        } 
        System.out.println("Sum of Digits: " + sum);
    }
}

