package basic_applications;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String args[]) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no:");
        a = sc.nextDouble();
        System.out.println("enter 2nd no:");
        b = sc.nextDouble();
        System.out.println("enter 3rd no:");
        c = sc.nextDouble();

        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " is largest number.");
            } else {
                System.out.println(c + " is largest number.");
            }
        } else {
            if (b >= c) {
                System.out.println(b + " is largest number.");
            } else {
                System.out.println(c + " is largest number.");
            }
        }
    }
}
